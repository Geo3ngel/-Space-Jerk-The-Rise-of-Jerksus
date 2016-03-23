package GameEngine;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import EntityDef.Controller;

public abstract class Entity implements ActionListener{

	protected SpriteSheet sprite;
	protected String name;
	protected int tile;
	
	protected int direction = 0;
	protected int phase = 1;
	
	public float x;
	public float y;
	protected float health;
	protected BufferedImage[][] spritePhases;
	protected float entitySpeed;
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
	public void setEntitySpeed(float speed) {
		entitySpeed = GameCanvas.SCALE * speed;
	}

	//this move method is probz useless as of soon, unless repurposed later
	public void Move(int tiles/*, int direction*/) {
		
		//this.direction = direction;
		//switch (direction) {
		// moving logic per round about
		//case 0:
		if(Controller.movingD){
			y += entitySpeed;
			
		}
		//case 1:
		else if(Controller.movingL){
			x -= entitySpeed;
			
		}
		//case 2:
		else if(Controller.movingL){
			x += entitySpeed;
			
		}
			
		//case 3:
		else if(Controller.movingL){
			y -= entitySpeed;
			
		}
		
	}
			

	public int getSpriteWidth() {
		return sprite.getWidth();
	}

	public int getSpriteHeight() {
		return sprite.getHeight();
	}

	// TEMP
	//Make it more general and override in Player Class
	// edits the buffered Sprite Sheet into the proper image
	public BufferedImage getSprite() {
		//change 2 to phase later
		return spritePhases[phase][direction];
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

	//gets the Entitie's X cord
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	//gets the Entitie's Y cord
	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
