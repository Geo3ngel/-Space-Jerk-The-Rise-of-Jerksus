package MapStuff;

import java.awt.image.BufferedImage;
import java.io.IOException;
import Mapping.TileSheetDef;
import Maps.Ground_Zero_House1;


//The goal of this class is to be able to paint over the original map
//with 'objects' to add in detail.

//Really its just so we can be lazy with the mapping Tiles/Spiriting
public class LoadTileObjects extends TileSheetDef{
	
public static BufferedImage[][] ObjMap;
	
	//changes objMap size so it can fit the map being loaded
	public static void MapChangeTo(int columns, int rows){
		ObjMap = new BufferedImage[columns][rows];
	}
	public static void setDefaultTile() {
		for (int i = 0; i < ObjMap.length; i++) {
			for (int a = 0; a < ObjMap[i].length; a++) {
				// must have tiles constructor before referencing tiles
				ObjMap[i][a] = null;
			}
		}
	}

	public static void setObjMap(BufferedImage[][] map) {
		for (int k = 0; k < ObjMap.length; k++) {
			for (int t = 0; t < (ObjMap[k].length); t++) {
				if (map[k][t] != null) {
					ObjMap[k][t] = map[k][t];
				}
			}
		}
	}
	
	public static void callMap() {
		//Ground_Zero.initializeGround_Zero();
		ObjMaps.Ground_Zero_House1.initializeGround_Zero_House1();
	}
	
}