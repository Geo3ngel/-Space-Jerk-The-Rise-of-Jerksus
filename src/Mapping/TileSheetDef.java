package Mapping;

import java.io.IOException;

public class TileSheetDef extends TileSheet {

	//Is now flexible and enables multiple tileSheets to be in usage
	public TileSheetDef(String filelocation, int tileSheetX, int tileSheetY) throws IOException {
		super(LoadImage(filelocation));
		setTileSheetDimensions(tileSheetX, tileSheetY);
	}
}