package Mapping;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class TileSheetDef extends TileSheet {

	// make flexible later for ease of referring to with seperate sprite sheets
	public TileSheetDef(String filelocation) throws IOException {
		super(LoadImage(filelocation));
		setTileSheetDimensions(4, 6);
	}
	
	public void loadObject(String filelocation) throws IOException{
		TileSheet.LoadImage(filelocation);
		setTileSheetDimensions(2,2);
	}
}