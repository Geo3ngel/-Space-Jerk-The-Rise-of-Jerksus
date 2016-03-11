package MapStuff;

import java.util.Scanner;

import Maps.Ground_Zero;
import Maps.Ground_Zero_House1;
import ObjMaps.LoadTileObjects;

public class MapLogic {
	static Scanner scan = new Scanner(System.in);

	public static void callMap() {
		
		//int n;
		//System.out.println("Which map would you like to try out?/n1 for Ground_Zero, 2 for House1");
		//n = scan.nextInt();
		//if(n == 1)
		//Ground_Zero.initializeGround_Zero();
		//else
		Ground_Zero_House1.initializeGround_Zero_House1();
		LoadTileObjects.callMap();
		ObjMaps.Ground_Zero_House1.initializeGround_Zero_House1();
	}
}