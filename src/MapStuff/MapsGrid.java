package MapStuff;

import java.awt.Point;
import GameEngine.GameCanvas;

public class MapsGrid {

	// Map, Tile, and Sprite initial* Scaling number
	int scale = 1;

	// Maps should be tiles in Lists with points
	// Aligns Things along a 32 point grid(Defines Tiles Spacing
	public Point gridCords(int x, int y) {
		Point p = new Point((int) (x * 32 * GameCanvas.SCALE), (int) (y * 32 * GameCanvas.SCALE));
		return p;
	}
}