package EntityDef;

import java.util.Scanner;

import GameEngine.Entity;
import GameEngine.GameCanvas;
import GameEngine.Main;

public class Controller {

	static Scanner scan = new Scanner(System.in);
	//Remove Screen Side Limits Later after adding in tile space rendering
	public static int direction = 2;
	public static int phase = 1;
	public static int tiles = 1;
	private static String input = "";

	// private static String openInv = "open inventory";

	public static int moveTick = 0;
	public static boolean moving = false;
	public static boolean movingD = false;
	public static boolean movingL = false;
	public static boolean movingU = false;
	public static boolean movingR = false;
	public static boolean typeable = true;

	// Hard coded movement strings for now
	public static void controller(String playerInput) {
		input = playerInput.toLowerCase();
	}

	public static void moveTicks() {
		{
			if (input.contains("move")) {

				moving = true;
			} else if (!(input.equals(""))) {
				// Change to not spam later
				System.out.println("Uhmm.. What?");
			}
			if (moving) {
				if (input.contains("down")) {
					//System.out.println("movin' down...");
					moving = false;
					movingD = true;
					direction = 0;
				}

				else if (input.contains("left")) {
					//System.out.println("movin' left...");
					moving = false;
					movingL = true;
					direction = 1;

				} else if (input.contains("up")) {

					//System.out.println("movin' up...");
					moving = false;
					movingU = true;
					direction = 3;

				} else if (input.contains("right"))

				{

					//System.out.println("movin' right...");
					moving = false;
					movingR = true;
					direction = 2;
				}

				else
				// Maybe make it randomly pick a witty line to say when a
				// command is
				// invalid
				{
					System.out.println("Yes, but move in which direction?");
				}
			}

			// create static movement check here that will tell it when to stop
			// going, and create movement flags
			// in each direction

			if (movingD) {
				if ((((int) (GameCanvas.Jerksus.getY() + 1)) < (GameCanvas.DEFAULT_SIZE))) {
					GameCanvas.Jerksus.setY(GameCanvas.Jerksus.getY() + 1);
					GameCanvas.Jerksus.getSprite();
					moveTick++;
					typeable = false;
				} else {
					System.out.println("Uhmmm.. theres a thing there...");
					movingD = false;
					moveTick = 0;
					tiles = 1;
					input = scan.nextLine();
				}
			}

			else if (movingL) {
				if (((int) ((GameCanvas.Jerksus.getX() - 1))) > -1) {
					GameCanvas.Jerksus.setX(GameCanvas.Jerksus.getX() - 1);
					moveTick++;
					typeable = false;
				} else {
					System.out.println("NO. YOU CAN'T MOVE ME THERE. JERK");
					movingU = false;
					tiles = 1;
					moveTick = 0;
					input = scan.nextLine();
				}
			}

			else if (movingU) {
				if (((int) ((GameCanvas.Jerksus.getY() - 1))) > -1) {
					GameCanvas.Jerksus.setY(GameCanvas.Jerksus.getY() - 1);
					moveTick++;
					typeable = false;
				} else {
					System.out.println("NO. YOU CAN'T MOVE ME THERE. JERK");
					movingU = false;
					tiles = 1;
					moveTick = 0;
					input = scan.nextLine();
				}
			}

			else if (movingR) {
				if ((((int) (GameCanvas.Jerksus.getX() + 1)) < (GameCanvas.DEFAULT_SIZE * GameCanvas.SCALE))) {
					GameCanvas.Jerksus.setX(GameCanvas.Jerksus.getX() + 1);
					moveTick++;
					typeable = false;
				} else {
					System.out.println("NO. YOU CAN'T MOVE ME THERE. JERK" + (GameCanvas.Jerksus.getX() + 1) + " ");
					movingD = false;
					moveTick = 0;
					tiles = 1;
					input = scan.nextLine();
				}
			}

			// move tileNum
			if (input.contains("2")) {
				tiles = 2;
			}
			if (input.contains("3")) {
				tiles = 3;
			}
			if (input.contains("4")) {
				tiles = 4;
			}
			if (input.contains("5")) {
				tiles = 5;
			}
			if (input.contains("6")) {
				tiles = 6;
			}
			if (input.contains("7")) {
				tiles = 7;
			}
			if (input.contains("8")) {
				tiles = 8;
			}
			if (input.contains("9")) {
				tiles = 9;
			}

			for (int i = 0; i <= tiles; i++) {
				if (moveTick == 4 + (32 * i)) {
					phase = 2;
				} else if (moveTick == 12 + (32 * i)) {
					phase = 0;
				} else if (moveTick == 22 + (32 * i)) {
					phase = 2;
				} else if (moveTick == 29 + (32 * i)) {
					phase = 1;
				}
			}
			if (moveTick >= 32 * tiles) {
				movingD = false;
				movingL = false;
				movingU = false;
				movingR = false;
				moveTick = 0;
				input = "";
				typeable = true;
				tiles = 1;
			}
		}

	}

	public void doMoveTick() {
		moveTick++;
	}

	public int getMoveTick() {
		return moveTick;
	}

	public static boolean isTypeAble() {
		return typeable;
	}

	public static String getInput() {
		return input;
	}
}