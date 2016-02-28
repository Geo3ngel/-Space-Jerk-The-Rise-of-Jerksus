package Mapping;

import java.awt.image.BufferedImage;

import GameEngine.GameCanvas;

public class TileDef {
	//Tile images sizes
	private float tileImageSizeX;
	private float tileImageSizeY;
	
	//Tile's Image
	private BufferedImage tileImg;

	public TileDef(BufferedImage tilePic) {
		tileImg = tilePic;
		tileImageSizeX = 32 * GameCanvas.SCALE;
		tileImageSizeY = 32 * GameCanvas.SCALE;
	};
	//public TileDef SacleTile(){
	//	return 
	//}
}
//CLASS UNNESSISARY? MAY BE DELETED IN FUTURE,
//AND HAVE POSITION DECLARED BY ARRAY,
//RESIZING DONE IN RENDERING,
//AND SIMPLY MAKE THE IMAGES 'OBJECTS'
