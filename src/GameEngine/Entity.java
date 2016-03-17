package GameEngine;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Entity {

	private SpriteSheet sprite;
	private String name;
	private int tile;
	protected int direction;
	protected float x;
	protected float y;
	protected float health;
	protected static BufferedImage[][] spritePhases;
	protected float entitySpeed;
	private boolean movingRight;
	private boolean movingLeft;
	private boolean movingUp;
	private boolean movingDown;
	protected int move = 0;

	// TODO: move the Location initialization logic into another method,
	// preferably in the entity's
	// child class, aka making this constructor into that, a constructor for all
	// types of entity's
	public Entity(String spriteLocation, int spriteSheetX, int spriteSheetY, Point Location, String entityName)
			throws IOException {
		new BufferedImageLoader();
		URL url = getClass().getResource(spriteLocation);
		sprite = new SpriteSheet(ImageIO.read(url));
		this.x = (float) Location.getX();
		this.y = (float) Location.getY();
		name = entityName;
		tile = 1;
		spritePhases = new BufferedImage[spriteSheetX][spriteSheetY];
		sprite.setSpriteSheetDimensions(spriteSheetX, spriteSheetY);
		for (int i = 0; i < spritePhases.length; i++) {
			for (int k = 0; k < spritePhases[i].length; k++)
				spritePhases[i][k] = sprite.getSprite(i * sprite.getWidth(), k * sprite.getHeight(), sprite.getWidth(),
						sprite.getHeight());
		}
	}

	// Used to re-construct the entity so that it is facing another direction
	// (or in another phase)
	// public Entity(String spriteLocation, Point Location, String entityName,
	// int direction) throws IOException {
	// this(spriteLocation, Location, entityName);
	// this.direction = direction;
	// }

	// Maybe have variants for run/walk, probably overload for faster/slower
	// mobs
	public void setEntitySpeed(int speed) {
		entitySpeed = GameCanvas.SCALE / speed;
	}

	public void getDirection(int direction) {
		this.direction = direction;
		switch (direction) {

		// moving logic per round about
		case 0:
			movingDown = true;
			y += entitySpeed;
			break;

		case 1:
			movingLeft = true;
			x -= entitySpeed;
			break;
			
		case 2:
			movingRight = true;
			x += entitySpeed;
			break;
			
		case 3:
			movingUp = true;
			y -= entitySpeed;
			break;
		}
	}

	public void Move(int tiles) {
		
			if(movingDown&&(move == 32)){
				move = 0;
				movingDown = false;
			}
			if(movingDown){
				y += entitySpeed;
				move++;
			}
			
			else if(movingLeft&&(move == 32)){
				move = 0;
				movingLeft = false;
			}
			if(movingLeft){
				x -= entitySpeed;
				move++;
			}
			
			if(movingRight&&(move == 32)){
				move = 0;
				movingRight = false;
			}
			else if(movingRight){
				x += entitySpeed;
				move++;
			}
			
			if(movingUp&&(move <= 32)){
				move = 0;
				movingUp = false;
			}
			else if(movingUp){
				y -= entitySpeed;
				move++;
			}
			
		

	}

	public int getSpriteWidth() {
		return sprite.getWidth();
	}

	public int getSpriteHeight() {
		return sprite.getHeight();
	}

	// TEMP
	// edits the buffered Sprite Sheet into the proper image
	public BufferedImage getSprite() {
		return spritePhases[1][2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDirection() {
		return direction;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
