package Maps;


import java.awt.image.BufferedImage;
import  Maps.TestingTiles;

//To be made abstract as a template for other Locations
public abstract class TestMap1 {

	public static BufferedImage[][] Map = new BufferedImage[20][5];

	//tiles constructor
	TestingTiles tile;
	// Creates a basic background in case tiles don't show
	public static void setDefaultTile() {
		for (int i = 0; i < Map.length; i++){
			for (int a = 0; a < Map[i].length; a++) {
				//must have tiles constructor before referencing tiles
				Map[i][a] = TestingTiles.grassTile1;
			}
		}
	}
}
