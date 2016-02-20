package GameEngine;

import java.io.IOException;

public class TileSheetDef extends TileSheet {
	
	public TileSheetDef() throws IOException {
		super(LoadImage("TestTileSheet.jpg"));
		setSpriteSheetDimensions(30,16);
	}
}