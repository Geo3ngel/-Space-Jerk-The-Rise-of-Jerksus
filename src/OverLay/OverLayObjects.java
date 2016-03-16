package OverLay;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class OverLayObjects extends TileSheetDef {

	public OverLayObjects() throws IOException {
		super("Floating Candle.png",1 ,1);	
		
		//Objects being initialized here
		floatingCandle = getTileImage(0, 0, getWidth(), getHeight());
		
		//below is for debugging
		//System.out.println("I'm here");
	}
	
	//Object Declarations
	public static BufferedImage floatingCandle;
}