package GameEngine;

import java.awt.Point;

import MapStuff.MapsGrid;

public class CollisionBlocks {

	private static float blockWidth;
	private static float blockHeight;
	static Point[] collisionBlock = new Point[5];
	public CollisionBlocks(int x, int y){
		
		blockWidth = MapStuff.TestingTiles.emptyTile.getWidth()-GameCanvas.SCALE;
		blockHeight = MapStuff.TestingTiles.emptyTile.getHeight()-GameCanvas.SCALE;
		collisionBlock[0] = MapsGrid.gridCords(x, y);
		collisionBlock[1] = MapsGrid.gridCords((int)(x + blockWidth),y);
		collisionBlock[2] = MapsGrid.gridCords((int)(x + blockWidth),(int)(y + blockHeight));
		collisionBlock[3] = MapsGrid.gridCords(x,(int)(y + blockHeight));
		collisionBlock[4] = MapsGrid.gridCords((int)(x + blockWidth/2),(int)(y + (blockHeight/2) - GameCanvas.SCALE));
		collisionBlock[5] = MapsGrid.gridCords((int)(x + blockWidth/2),(int)(y + (blockHeight/2) - GameCanvas.SCALE));
	}
}
