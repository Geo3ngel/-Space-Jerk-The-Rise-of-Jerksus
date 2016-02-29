package Mapping;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class TileSheetDef extends TileSheet {

	public TileSheetDef() throws IOException {
		super(LoadImage("tempTileSheet.png"));
		setTileSheetDimensions(4, 6);
	}
}