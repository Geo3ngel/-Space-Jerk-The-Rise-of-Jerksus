package OverLay;

import java.awt.image.BufferedImage;

public class Ground_Zero_House1 {

	public static BufferedImage[][] ground_Zero_House1 = new BufferedImage[30][16];
	
	public static void initializeGround_Zero_House1() {
		OverLay.LoadObjMaps.MapChangeTo(30,16);
		
		ground_Zero_House1[17][7] = OverLayObjects.floatingCandle;
		
		OverLay.LoadObjMaps.setObjMapOverLay(ground_Zero_House1);
	}
}