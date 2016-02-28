package Maps;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class TestingTiles extends TileSheetDef {

	public TestingTiles() throws IOException {
		super();
		// Load in the Tiles from here
		waterTile1 = getTileImage(0, 2, getWidth(), getHeight());
		grassTile1 = getTileImage(1, 3, getWidth(), getHeight());
	}

	// These Serve as Names for Tiles defined by tileSheet to be assigned a
	// position.
	public static BufferedImage grassTile1;
	public static BufferedImage waterTile1;

	//Unused Loading Method*
	//public void loadInTiles() {
	//	waterTile1 = getTileImage(0, 2, getWidth(), getHeight());
	//	grassTile1 = getTileImage(1, 3, getWidth(), getHeight());
	//}

	public BufferedImage waterGrassTile = getTileImage(1, 0, getWidth(), getHeight());

	public BufferedImage waterTile = getTileImage(0, 2, getWidth(), getHeight());

	public BufferedImage grassTile = getTileImage(1, 3, getWidth(), getHeight());

	// Will render in tiles then set them to static buffered images.
	// only needs to be rendered once per map load

	// public void RenderTiles

	// public BufferedImage grassTile
	// =(getTileImage(1,3,getWidth(),getHeight()));
}