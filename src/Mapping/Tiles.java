package Mapping;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Tiles extends TileSheetDef {

	public Tiles() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	//These Serve as Names for Tiles defined by tileSheet to be assigned a position.
	public BufferedImage waterEdgeGrass = getTileImage(1,0,getWidth(),getHeight());
	public BufferedImage waterTile = getTileImage(4,8,getWidth(),getHeight());
	public BufferedImage GrassTile = getTileImage(12,10,getWidth(),getHeight());
	public BufferedImage getGrassTile(){
		return GrassTile;
	}
}