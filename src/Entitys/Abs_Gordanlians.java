package Entitys;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import GameEngine.BufferedImageLoader;
import GameEngine.Entity;
import GameEngine.SpriteSheet;

public abstract class Abs_Gordanlians extends HostileMobs{

	
	public Abs_Gordanlians(String spriteLocation, int spriteSheetX, int spriteSheetY, Point location, String entityName)
			throws IOException {
		super(spriteLocation, spriteSheetX, spriteSheetY, location, entityName);
		// TODO Auto-generated constructor stub
	}

}
