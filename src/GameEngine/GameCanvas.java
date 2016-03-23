package GameEngine;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

import EntityDef.Controller;
import Entitys.Abs_Gordanlians;
import Entitys.HostileMobs;
import Entitys.Player;
import Entitys.Gordanlians.Peasant_Gordanlian;
import MapStuff.MapsGrid;
import MapStuff.MapLogic;
import MapStuff.Mapping;
import MapStuff.TestingTiles;
import Maps.Ground_Zero;
import ObjMaps.LoadTileObjects;
import ObjMaps.Objects;
import OverLay.LoadObjMaps;
import OverLay.OverLayObjects;

public class GameCanvas extends Canvas implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long period;
	private Graphics graphics;
	private Thread thread;
	private long fps;
	public static Entity Jerksus;
	public static Abs_Gordanlians testMob;
	public static float SCALE;
	public static final int DEFAULT_SIZE = 480;

	Scanner scan = new Scanner(System.in);

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
		//Period is always 1 / FPS you wants
		period = 1/15;
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

	// This is where you add things to initialize for layers/imageSheets
	TestingTiles tile;

	Objects object;

	OverLayObjects OverLayObj;

	private void init() {
		try {
			Jerksus = new Player("AnimationSpriteSheet.png", 3, 4, MapsGrid.gridCords(15, 7), "Jerksus");
			testMob = new Peasant_Gordanlian("Gordanlian.png", 1, 1, MapsGrid.gridCords(5, 10), "Peasant_Gordanlian");
			tile = new TestingTiles();
			object = new Objects();
			OverLayObj = new OverLayObjects();
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
		MapLogic.callMap();

		// Draws out Map
		for (int i = 0; i < Mapping.Map.length; i++) {
			for (int a = 0; a < Mapping.Map[i].length; a++) {
				graphics.drawImage(Mapping.Map[i][a], (int) (i * 32 * SCALE), (int) (a * 32 * SCALE),
						(int) (32 * SCALE), (int) (32 * SCALE), null);
			}
		}

		// Draws objects over Map, but under entities
		for (int i = 0; i < LoadTileObjects.ObjMap.length; i++) {
			for (int a = 0; a < LoadTileObjects.ObjMap[i].length; a++) {
				if (LoadTileObjects.ObjMap[i][a] != null) {
					graphics.drawImage(LoadTileObjects.ObjMap[i][a], (int) (i * 32 * SCALE), (int) (a * 32 * SCALE),
							(int) (32 * SCALE), (int) (32 * SCALE), null);
				}
			}
		}
		
		//for(int i = Player.getPlayerMapGridCordX())

		// Entities go here
		drawImage(graphics, Jerksus);
		drawImage(graphics, testMob);
		graphics.drawString("FPS: " + fps, 20, 20);

		// below commented out code is taking image from buffered Entity Array
		// to test
		// graphics.drawImage(Entity.spritePhases[0][1], 10, 10, 128,128, null);

		// Draws Map objects over Map and Entities
		for (int i = 0; i < LoadObjMaps.ObjMapOverLay.length; i++) {
			for (int a = 0; a < LoadObjMaps.ObjMapOverLay[i].length; a++) {
				if (LoadObjMaps.ObjMapOverLay[i][a] != null) {
					graphics.drawImage(LoadObjMaps.ObjMapOverLay[i][a], (int) (i * 32 * SCALE), (int) (a * 32 * SCALE),
							(int) (32 * SCALE), (int) (32 * SCALE), null);

					// debugging statement below
					// System.out.println("its drawing at " + i + " " + a);
				}
			}
		}
	}

	public void Draw() {
		if (!this.getBufferStrategy().contentsLost()) {
			this.getBufferStrategy().show();
			if (graphics != null) {
				graphics.dispose();
			}
		}
	}

	public void entitiesMoving() {
		Jerksus.Move(2);
	}

	public void Update() {
		Jerksus.setEntitySpeed(.45f);
		tick();
		// Jerksus.Move(2, .15f * SCALE);
		// DONT have him move here, just get his pos.

		// System.out.println(Jerksus.getX() + " " + Jerksus.getY());

		// set entity speed in child class with fast/slow paces, and able to
		// scale to buffs/debuffs

		// We Want this to update the players Position
		// and maybe mobs/other entities as well
	}

	public void tick() {
		if (!(Controller.getInput().equals(null))){
			//we want it cycle through these ticks
			Controller.moveTicks();
		}
		if(Controller.isTypeAble()){
			Controller.controller(scan.nextLine());
		}
	}

	// This is where the game cycles through all its steps (updating stuff)
	@Override
	public void run() {
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				while(true){
					long beginTime = System.currentTimeMillis();
					Update();
					long fps = System.currentTimeMillis() - beginTime;
					long sleepTime = ((1/15)*1000) - fps;
					//System.out.println(fps);
					try {
						sleepTime = 15;
						if (sleepTime > 0) {
							//find why sleep time is 0 to fix movement bug(doesn't matter?)
							Thread.sleep(sleepTime);
						}
					} catch (Exception e) {
					}
				}
			}
		};
		Thread th = new Thread(thread);
		th.start();
		while (true) {
			long beginTime = System.currentTimeMillis();

			// update will be updating all the entity animations/positioning,
			// and tile animations
			//Update();

			Render();
			Draw();
			long afps = System.currentTimeMillis() - beginTime;
			long sleepTime = period - afps;
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
    
	public void drawImage(Graphics g, HostileMobs h){
		if (h != null) {
			g.drawImage(h.getSprite(), (int) (h.getX() * SCALE), (int) (h.getY() * SCALE),
					(int) (h.getSpriteWidth() * SCALE), (int) (h.getSpriteHeight() * SCALE), null);
		}
	}

}
