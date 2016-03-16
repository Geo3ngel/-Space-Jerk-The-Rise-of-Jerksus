package MapStuff;

import java.util.Scanner;

import Maps.Ground_Zero;
import Maps.Ground_Zero_House1;

public class MapLogic {
	static Scanner scan = new Scanner(System.in);

	public static void groundZeroHouse1(){
		Ground_Zero_House1.initializeGround_Zero_House1();
		ObjMaps.Ground_Zero_House1.initializeGround_Zero_House1();
		OverLay.Ground_Zero_House1.initializeGround_Zero_House1();
	}
	
	public static void groundZero(){
		Ground_Zero.initializeGround_Zero();
	}
	public static void callMap() {
		
		//int n;
		//System.out.println("Which map would you like to try out?/n1 for Ground_Zero, 2 for House1");
		//n = scan.nextInt();
		//if(n == 1)
		//Ground_Zero.initializeGround_Zero();
		//else
		groundZeroHouse1();
	}
}