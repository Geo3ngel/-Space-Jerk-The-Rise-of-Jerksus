package Mapping;

import java.io.IOException;

public class TileSheetDef extends TileSheet {
	
	public TileSheetDef() throws IOException {
		super(LoadImage("tempTileSheet.jpg"));
		setTileSheetDimensions(14,14);
	}
}