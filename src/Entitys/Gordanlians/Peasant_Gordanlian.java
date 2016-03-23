package Entitys.Gordanlians;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import EntityDef.Controller;
import Entitys.Abs_Gordanlians;
import GameEngine.BufferedImageLoader;
import GameEngine.SpriteSheet;

public class Peasant_Gordanlian extends Abs_Gordanlians{

	public Peasant_Gordanlian(String spriteLocation, int spriteSheetX, int spriteSheetY, Point location, String entityName) throws IOException {
		super(spriteLocation, spriteSheetX, spriteSheetY, location, entityName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BufferedImage getSprite() {
		// change 2 to phase later
		return spritePhases[0][0];
	}

}
