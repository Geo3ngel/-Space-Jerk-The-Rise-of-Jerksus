package Maps;

import Mapping.TileDef;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import  Maps.TestingTiles;
import Tiles.GrassTileTest;

public abstract class TestMap1 {

	// Works, but now sure how to use, so split it into two instead.
	public static BufferedImage[][] Map = new BufferedImage[20][5];

	//tiles constructor
	TestingTiles tile;
	// Creates a basic background in case tiles don't show
	public void setDefaultTile() {
		for (int i = 0; i < Map.length; i++)
			for (int a = 0; a < Map.length; a++) {
				//must have tiles constructor before referencing tiles
				Map[i][a] = tile.grassTile;	//GrassTileTest.Tile;
			}
	}
}
