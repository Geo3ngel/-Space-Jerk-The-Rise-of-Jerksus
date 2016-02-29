package GameEngine;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

import MapStuff.MapsGrid;
import MapStuff.TestMap1;
import MapStuff.TestingTiles;

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
	public static float SCALE;
	public static final int DEFAULT_SIZE = 480;

	public GameCanvas(int width, int height) {
		this.setIgnoreRepaint(true);
		this.setBounds(0, 0, width, height);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		SCALE = height / DEFAULT_SIZE;
	}

	public void updateScale(int width, int height) {
		this.setBounds(0, 0, width, height);
		SCALE = height / DEFAULT_SIZE;
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

	// Change Later to Scale and start in different places on different maps
	TestingTiles tile;

	private void init() {
		try {
			Jerksus = new Entity("AnimationSpriteSheet.png", new Point(5, 60), "Jerksus");
			tile = new TestingTiles();
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	// private void initMap(){

	// }

	// Renders Everything
	public void Render() {
		graphics = this.getBufferStrategy().getDrawGraphics();
		graphics.setColor(Color.BLACK);
		int width = (int) getBounds().getWidth();
		int height = (int) getBounds().getHeight();
		graphics.fillRect(0, 0, width, height);
		graphics.setColor(Color.white);

		// Will need to have another class to handle which map to load in, then
		// reference it here.

		// Loads In background Map Tiles
		TestMap1.callMap();

		// Draws out BackGround
		for (int i = 0; i < TestMap1.Map.length; i++) {
			for (int a = 0; a < TestMap1.Map[i].length; a++) {
				graphics.drawImage(TestMap1.Map[i][a], (int) (i * 32 * SCALE), (int) (a * 32 * SCALE),
						(int) (32 * SCALE), (int) (32 * SCALE), null);
			}
		}
		drawImage(graphics, Jerksus);
		graphics.drawString("FPS: " + fps, 20, 20);
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
		Jerksus.Move(2, .15f * SCALE);
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
			g.drawImage(s.getSprite(), (int) (s.getX() * SCALE), (int) (s.getY() * SCALE),
					(int) (s.getSpriteWidth() * SCALE), (int) (s.getSpriteHeight() * SCALE), null);
		}
	}

}
