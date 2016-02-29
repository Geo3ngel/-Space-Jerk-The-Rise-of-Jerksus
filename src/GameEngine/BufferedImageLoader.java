package GameEngine;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import java.io.IOException;

public class BufferedImageLoader {

	public static BufferedImage LoadImage(String ImagePath) throws IOException {
		URL url = BufferedImageLoader.class.getClass().getResource(ImagePath);
		BufferedImage image = ImageIO.read(url);
		return image;
	}

}
