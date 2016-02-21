package Mapping;

import java.awt.Point;

public class MapsGrid {

	//Map, Tile, and Sprite Scaling number
	int scale = 1;
	
	//Maps should be tiles in Lists with points
	//Aligns Things along a 32 point grid
	public Point gridCords(int x, int y){
		Point p = new Point(x * 32 * scale,y * 32 * scale);
		return p;
	}
	
}
