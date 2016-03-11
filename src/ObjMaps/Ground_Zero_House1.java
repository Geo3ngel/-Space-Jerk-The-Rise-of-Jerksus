package ObjMaps;

import java.awt.image.BufferedImage;

import MapStuff.Mapping;
import MapStuff.TestingTiles;

public class Ground_Zero_House1 {

	public static BufferedImage[][] ground_Zero_House1 = new BufferedImage[30][16];
	
	public static void initializeGround_Zero_House1() {
		ObjMaps.LoadTileObjects.MapChangeTo(30, 16);
		ObjMaps.LoadTileObjects.setDefaultTile();
		
		ground_Zero_House1[2][2] = MapStuff.TestingTiles.dirtTile1;
		ground_Zero_House1[4][4] = Objects.tableObj;
		ground_Zero_House1[6][6] = Objects.tableObj;
		ground_Zero_House1[8][8] = Objects.tableObj;
		ground_Zero_House1[10][10] = Objects.nextObjTest;
		
		ObjMaps.LoadTileObjects.setObjMap(ground_Zero_House1);
	}
}