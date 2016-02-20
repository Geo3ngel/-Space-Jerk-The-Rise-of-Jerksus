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
	private Point location;
	private String name;

	public Entity(String spriteLocation, Point Location, String entityName) throws IOException {
		new BufferedImageLoader();
		URL url = getClass().getResource(spriteLocation);
		sprite = new SpriteSheet(ImageIO.read(url));
		this.location = Location;
		name = entityName;
		tile = 1;
	}

	public Entity(String spriteLocation, Point Location, String entityName, int direction) throws IOException {
		this(spriteLocation, Location, entityName);
		this.direction = direction;
	}

	public void Move(int direction, int speed) {
		this.direction = direction;
		switch (direction) {
		case 0:
			location.y += speed;
			break;
		case 1:
			location.x -= speed;
			break;
		case 2:
			location.x += speed;
			break;
		case 3:
			location.y -= speed;
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

	public Point getLocation() {
		return location;
	}

}
