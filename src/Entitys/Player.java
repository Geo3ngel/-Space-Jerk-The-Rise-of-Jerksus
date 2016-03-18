package Entitys;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import EntityDef.Controller;
import GameEngine.*;

public class Player extends Entity{

	public Player(String spriteLocation, int spriteSheetX, int spriteSheetY, Point Location, String entityName)
			throws IOException {
		super(spriteLocation, spriteSheetX, spriteSheetY, Location, entityName);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public BufferedImage getSprite() {
		//change 2 to phase later
		return spritePhases[Controller.phase][Controller.direction];
	}

}
