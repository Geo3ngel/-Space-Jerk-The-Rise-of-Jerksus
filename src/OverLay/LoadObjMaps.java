package OverLay;

import java.awt.image.BufferedImage;

//The goal of this class is to be able to paint over the original map
//with 'objects' to add in detail.

//Really its just so we can be lazy with the mapping Tiles/Spiriting
public class LoadObjMaps{
	
public static BufferedImage[][] ObjMapOverLay;
	
	//changes objMap size so it can fit the map being loaded
	public static void MapChangeTo(int columns, int rows){
		ObjMapOverLay = new BufferedImage[columns][rows];
	}

	public static void setObjMapOverLay(BufferedImage[][] map) {
		for (int k = 0; k < ObjMapOverLay.length; k++) {
			for (int t = 0; t < (ObjMapOverLay[k].length); t++) {
				if (map[k][t] != null) {
					ObjMapOverLay[k][t] = map[k][t];
				}
			}
		}
	}
}