package ObjMaps;

import java.awt.image.BufferedImage;
import java.io.IOException;
import Mapping.TileSheetDef;
import Maps.Ground_Zero_House1;


//The goal of this class is to be able to paint over the original map
//with 'objects' to add in detail.

//Really its just so we can be lazy with the mapping Tiles/Spiriting
public class LoadTileObjects{
	
public static BufferedImage[][] ObjMap;
	
	//changes objMap size so it can fit the map being loaded
	public static void MapChangeTo(int columns, int rows){
		ObjMap = new BufferedImage[columns][rows];
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
	
}