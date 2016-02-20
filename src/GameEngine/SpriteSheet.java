package GameEngine;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	//Temporary
	int spriteFrames = 3;
	int spriteSequences = 4;
	
	public BufferedImage spriteSheet;
	
	public SpriteSheet(BufferedImage x){
		this.spriteSheet = x;
	}
	
	//Gets the sprite sheet's Height
	public int getHeight(){
		return spriteSheet.getHeight()/4;
	}
	
	//Gets the sprite sheet's width
	public int getWidth(){
		return spriteSheet.getWidth()/3;
	}
	
	public BufferedImage getSprite(int x, int y, int width, int height){
		BufferedImage sprite = spriteSheet.getSubimage(x, y, width, height);
				return sprite;
	}
}
