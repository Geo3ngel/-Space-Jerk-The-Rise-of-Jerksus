package ObjMaps;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class Objects extends TileSheetDef {

	public Objects() throws IOException {
		super("table2.png",2 ,2);		
		//Objects being initialized here
		tableObj = getTileImage(0, 0, getWidth(), getHeight());

		nextObjTest = getTileImage(0,1, getWidth(), getHeight());

	}
	
	//Object Declarations
	public static BufferedImage tableObj;
	public static BufferedImage nextObjTest;
}