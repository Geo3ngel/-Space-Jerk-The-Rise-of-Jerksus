package Maps;

import MapStuff.*;
import java.awt.image.BufferedImage;

//First Map in game, is where the crash site will be.
//Using as a testing map for now that extends off of TestMap1

//insert 9/11 Joke here
public class Ground_Zero{

	public static BufferedImage[][] ground_Zero = new BufferedImage[20][20];
	
	public Ground_Zero(){
		Mapping.setDefaultTile(TestingTiles.grassTile1);
		Mapping.MapChangeTo(25, 20);
		
		ground_Zero[0][0] = TestingTiles.waterTile1;
		ground_Zero[0][1] = TestingTiles.waterTile1;
		ground_Zero[0][2] = TestingTiles.waterTile1;
		ground_Zero[1][0] = TestingTiles.waterTile1;
		ground_Zero[1][1] = TestingTiles.waterTile1;
		ground_Zero[1][2] = null;
		
		
		MapStuff.Mapping.setMap(ground_Zero);
	}
}
