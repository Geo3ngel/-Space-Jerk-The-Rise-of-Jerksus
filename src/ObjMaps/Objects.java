package ObjMaps;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class Objects extends TileSheetDef {

	public Objects() throws IOException {
		super("table.png");
		tableObj = getTileImage(0,0, getWidth(), getHeight());
		
		//Objects being initialized here
		tableObj = getTileImage(2, 5, getWidth(), getHeight());
	}

	
	//Object Declarations
	public static BufferedImage tableObj;
}