package Entitys;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import EntityDef.Controller;
import GameEngine.BufferedImageLoader;
import GameEngine.Entity;
import GameEngine.SpriteSheet;

public abstract class HostileMobs extends Entity {

	public HostileMobs(String spriteLocation, int spriteSheetX, int spriteSheetY, Point location, String entityName)
			throws IOException {
		super(spriteLocation, spriteSheetX, spriteSheetY, location, entityName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BufferedImage getSprite() {
		// change 2 to phase later
		return spritePhases[1][1];
	}

}