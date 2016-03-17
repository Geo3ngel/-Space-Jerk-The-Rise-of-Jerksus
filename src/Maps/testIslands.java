package Maps;

import java.awt.image.BufferedImage;

import MapStuff.Mapping;
import MapStuff.TestingTiles;

public class testIslands {

	public static BufferedImage[][] ground_Zero_House1 = new BufferedImage[30][16];

	public static void initializeGround_Zero_House1() {
		Mapping.MapChangeTo(30, 16);
		Mapping.setDefaultTile(TestingTiles.emptyTile);
	}
}
