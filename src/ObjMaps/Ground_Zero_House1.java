package ObjMaps;

import java.awt.image.BufferedImage;

import MapStuff.LoadTileObjects;
import MapStuff.Mapping;
import MapStuff.TestingTiles;

public class Ground_Zero_House1 {

	public static BufferedImage[][] ground_Zero_House1 = new BufferedImage[30][16];
	
	public static void initializeGround_Zero_House1() {
		MapStuff.LoadTileObjects.MapChangeTo(30, 16);
		MapStuff.LoadTileObjects.setDefaultTile();
		
		ground_Zero_House1[2][2] = Objects.tableObj;
		ground_Zero_House1[4][4] = Objects.tableObj;
		ground_Zero_House1[6][6] = Objects.tableObj;
		ground_Zero_House1[8][8] = Objects.tableObj;
		ground_Zero_House1[10][10] = Objects.tableObj;
		
		MapStuff.LoadTileObjects.setObjMap(ground_Zero_House1);
	}
}