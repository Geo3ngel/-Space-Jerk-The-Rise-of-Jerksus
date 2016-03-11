package Mapping;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class TileSheetDef extends TileSheet {

	public TileSheetDef(String filelocation) throws IOException {
		super(LoadImage(filelocation));
		setTileSheetDimensions(4, 6);
	}
	
	public void loadObject(String filelocation) throws IOException{
		TileSheet.LoadImage(filelocation);
		setTileSheetDimensions(0,0);
	}
}