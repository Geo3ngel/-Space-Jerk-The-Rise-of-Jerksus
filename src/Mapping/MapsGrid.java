package Mapping;

import java.awt.Point;

public class MapsGrid {

	//Maps should be tiles in Lists with points
	//Aligns Things along a 32 point grid
	public Point gridCords(int x, int y){
		Point p = new Point(x * 32,y * 32);
		return p;
	}
	
}
