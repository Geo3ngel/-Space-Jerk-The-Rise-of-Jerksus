package GameEngine;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Mapping.Tiles;

public class GameCanvas extends Canvas implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long period;
	private Graphics graphics;
	private Thread thread;
	private long fps;
	Entity Jerksus;

	public GameCanvas(int width, int height) {
		this.setIgnoreRepaint(true);
		this.setBounds(0, 0, width, height);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
	}

	@Override
	public void addNotify() {
		// TODO Auto-generated method stub
		super.addNotify();
		this.createBufferStrategy(2);
		requestFocus();
		init();
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
	}
	Tiles tile;
	private void init() {
		try {
			Jerksus = new Entity("AnimationSpriteSheet.png",new Point(150,550), "Jerksus");
			tile = new Tiles();
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	//Renders Everything
	public void Render() {
		graphics = this.getBufferStrategy().getDrawGraphics();
		graphics.setColor(Color.BLACK);
		int width = (int) getBounds().getWidth();
		int height = (int) getBounds().getHeight();
		graphics.fillRect(0, 0, width, height);
		graphics.drawImage(tile.waterTile, 20, 20, 32, 32, null);
		graphics.drawImage(tile.GrassTile, 420, 450, 128, 128, null);
		drawImage(graphics, Jerksus);
		graphics.setColor(Color.white);
		graphics.drawString("FPS: " + fps, 20, 20);
		//replace the tile with an array of tiles later in life.
		//that means put this in another object in tiles
	}

	public void Draw() {
		if (!this.getBufferStrategy().contentsLost()) {
			this.getBufferStrategy().show();
			if (graphics != null) {
				graphics.dispose();
			}
		}
	}

	public void Update() {
		Jerksus.Move(2, 1);
	}

	@Override
	public void run() {
		while (true) {
			long beginTime = System.currentTimeMillis();
			Update();
			Render();
			Draw();
			fps = System.currentTimeMillis() - beginTime;
			long sleepTime = period - fps;
			try {
				if (sleepTime > 0) {
					Thread.sleep(sleepTime);
				}
			} catch (Exception e) {
			}
		}
	}
	
	public void drawImage(Graphics g, Entity s) {
		if (s != null) {
			g.drawImage(s.getSprite(), s.getLocation().x, s.getLocation().y,
					(int) (s.getSpriteWidth() * this.getBounds().getSize().getHeight() / 256),
					(int) (s.getSpriteHeight() * this.getBounds().getSize().getHeight() / 256), null);
		}
	}

}
