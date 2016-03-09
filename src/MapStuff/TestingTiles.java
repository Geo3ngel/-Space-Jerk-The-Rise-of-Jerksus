package MapStuff;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class TestingTiles extends TileSheetDef {

	public TestingTiles() throws IOException {
		super();
		// Load in the Tiles from here
		waterTile1 = getTileImage(0, 2, getWidth(), getHeight());
		grassTile1 = getTileImage(1, 3, getWidth(), getHeight());
		dirtTile1 = getTileImage(0, 4, getWidth(), getHeight());
	}

	// These Serve as Names for Tiles defined by tileSheet to be assigned a
	// position.
	public static BufferedImage grassTile1;
	public static BufferedImage waterTile1;
	public static BufferedImage dirtTile1;
}