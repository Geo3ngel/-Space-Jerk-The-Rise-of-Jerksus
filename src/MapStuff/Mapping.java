package MapStuff;

import java.awt.image.BufferedImage;

import MapStuff.MapsGrid;
import Maps.Ground_Zero;
import Maps.Ground_Zero_House1;
//To be made abstract as a template for other Locations
public class Mapping {

	public static BufferedImage[][] Map;
	
	//changes map size so it can fit the map being  loaded
	public static void MapChangeTo(int columns, int rows){
		Map = new BufferedImage[columns][rows];
	}

	// Creates a basic background in case tiles don't show
	public static void setDefaultTile(BufferedImage tile) {
		for (int i = 0; i < Map.length; i++) {
			for (int a = 0; a < Map[i].length; a++) {
				// must have tiles constructor before referencing tiles
				Map[i][a] = tile;
			}
		}
	}

	// will allow extended 'Maps' to set map tiles
	public static void setMap(BufferedImage[][] map) {
		for (int k = 0; k < Map.length; k++) {
			for (int t = 0; t < (Map[k].length); t++) {
				if (map[k][t] != null) {
					Map[k][t] = map[k][t];
				}
			}
		}
	}

	//To Be implemented
	//public  void setBoundries();

	//Put in another class that will control Mapping LOgic at some point
	// will initialize everything from the background default tiles,
	// to the pixel boundaries in the render method in GameCanvas.
	public static void callMap() {
		//Ground_Zero.initializeGround_Zero();
		Ground_Zero_House1.initializeGround_Zero_House1();
	}
}