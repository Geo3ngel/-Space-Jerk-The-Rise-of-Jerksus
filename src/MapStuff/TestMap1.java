package MapStuff;

import java.awt.image.BufferedImage;

import MapStuff.MapsGrid;
import MapStuff.TestingTiles;

//To be made abstract as a template for other Locations
public abstract class TestMap1 {

	public static BufferedImage[][] Map = new BufferedImage[20][5];

	// Creates a basic background in case tiles don't show
	public static void setDefaultTile() {
		for (int i = 0; i < Map.length; i++) {
			for (int a = 0; a < Map[i].length; a++) {
				// must have tiles constructor before referencing tiles
				Map[i][a] = TestingTiles.grassTile1;
			}
		}
	}

	// will allow extended 'Maps' to set map tiles
	public abstract void setMap();

	public abstract void setBoundries();

	// will initialize everything from the background default tiles,
	// to the pixel boundaries in the render method in GameCanvas.
	public static void callMap() {
		setDefaultTile();
	}
}
