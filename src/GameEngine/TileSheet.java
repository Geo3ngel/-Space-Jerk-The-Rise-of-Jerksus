package GameEngine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import javax.imageio.ImageIO;

import org.omg.CORBA.portable.InputStream;

public class TileSheet {

	protected int tileSets;
	protected int tileStates;

	public BufferedImage tileSheet;

	public TileSheet(BufferedImage x) {
		this.tileSheet = x;
	}

	// Determines how many frames there are for the Tile in the picture
	public void setSpriteSheetDimensions(int x, int y) {
		tileSets = x;
		tileStates = y;
	}

	// Gets the sprite sheet's Height
	public int getHeight() {
		return tileSheet.getHeight() / tileSets;
	}

	// Gets the sprite sheet's Width
	public int getWidth() {
		return tileSheet.getWidth() / tileStates;
	}

	public static BufferedImage LoadImage(String name) throws IOException {
		return ImageIO.read(TileSheet.class.getResourceAsStream(name));
	}

	public BufferedImage getTileImage(int x, int y, int width, int height) {
		BufferedImage sprite = tileSheet.getSubimage(x * 10, y * 10, width, height);
		return sprite;
	}
}