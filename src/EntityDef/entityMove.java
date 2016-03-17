package EntityDef;

import GameEngine.GameCanvas;

public class entityMove {

	public static void move(int numOfTilesToMove, int direction) {

		GameCanvas.move = 0;

		if (GameCanvas.move != 32*numOfTilesToMove) {
			GameCanvas.Jerksus.getDirection(2);
			GameCanvas.move++;
		} 
	

		}

	}