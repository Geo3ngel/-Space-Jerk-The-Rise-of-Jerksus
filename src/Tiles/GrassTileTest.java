package Tiles;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class GrassTileTest extends TileSheetDef{
	
	public GrassTileTest() throws IOException {
		super();
	}
	
	//This is in the wrong place, to be fixed later
	public static BufferedImage Tile;
	//Is it though?
	
	//mess around with this until able to grab tile in static form properly.
	public void getTile(){
		 Tile = getTileImage(0,2,getWidth(),getHeight());
	}
}