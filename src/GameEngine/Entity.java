package GameEngine;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Entity {

	private SpriteSheet sprite;
	private int direction;
	private int tile;
	private float x;
	private float y;
	private String name;

	public Entity(String spriteLocation, Point Location, String entityName) throws IOException {
		new BufferedImageLoader();
		URL url = getClass().getResource(spriteLocation);
		sprite = new SpriteSheet(ImageIO.read(url));
		this.x = (float) Location.getX();
		this.y = (float) Location.getY();
		name = entityName;
		tile = 1;
	}

	public Entity(String spriteLocation, Point Location, String entityName, int direction) throws IOException {
		this(spriteLocation, Location, entityName);
		this.direction = direction;
	}

	public void Move(int direction, float speed) {
		this.direction = direction;
		switch (direction) {
		case 0:
			y += speed;
			break;
		case 1:
			x -= speed;
			break;
		case 2:
			x += speed;
			break;
		case 3:
			y -= speed;
			break;
		}
	}
	
	public int getSpriteWidth(){
		return sprite.getWidth();
	}
	
	public int getSpriteHeight(){
		return sprite.getHeight();
	}

	public BufferedImage getSprite() {
		return sprite.getSprite(tile * sprite.getWidth(), direction * sprite.getHeight(), sprite.getWidth(),
				sprite.getHeight());
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
