package ObjMaps;

import java.awt.image.BufferedImage;
import java.io.IOException;

import Mapping.TileSheetDef;

public class Objects extends TileSheetDef {

	public Objects() throws IOException {
		super("table2.png");		
		//Objects being initialized here
		tableObj = getTileImage(0, 0, 32, 32);
		nextObjTest = getTileImage(0,1,32,32);
		
	}
	
	//Object Declarations
	public static BufferedImage tableObj;
	public static BufferedImage nextObjTest;
}