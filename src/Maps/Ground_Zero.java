package Maps;

import MapStuff.*;
import java.awt.image.BufferedImage;

//First Map in game, is where the crash site will be.
//Using as a testing map for now that extends off of TestMap1

//insert 9/11 Joke here
public class Ground_Zero{

	public static BufferedImage[][] ground_Zero = new BufferedImage[30][16];
	
	public static void initializeGround_Zero(){
		Mapping.MapChangeTo(30, 16);
		Mapping.setDefaultTile(TestingTiles.waterTile1);
		
		ground_Zero[5][4] = TestingTiles.dirtTile1;
		ground_Zero[5][5] = TestingTiles.dirtTile1;
		ground_Zero[5][6] = TestingTiles.dirtTile1;
		ground_Zero[5][7] = TestingTiles.dirtTile1;
		ground_Zero[5][8] = TestingTiles.dirtTile1;
		ground_Zero[5][9] = TestingTiles.dirtTile1;
		ground_Zero[5][10] = TestingTiles.dirtTile1;
		
		ground_Zero[6][3] = TestingTiles.dirtTile1;
		ground_Zero[6][4] = TestingTiles.dirtTile1;
		ground_Zero[6][5] = TestingTiles.dirtTile1;
		ground_Zero[6][6] = TestingTiles.dirtTile1;
		ground_Zero[6][7] = TestingTiles.dirtTile1;
		ground_Zero[6][8] = TestingTiles.dirtTile1;
		ground_Zero[6][9] = TestingTiles.dirtTile1;
		ground_Zero[6][10] = TestingTiles.dirtTile1;
		ground_Zero[6][11] = TestingTiles.dirtTile1;
		
		ground_Zero[7][3] = TestingTiles.dirtTile1;
		ground_Zero[7][4] = TestingTiles.dirtTile1;
		ground_Zero[7][5] = TestingTiles.dirtTile1;
		ground_Zero[7][6] = TestingTiles.dirtTile1;
		ground_Zero[7][8] = TestingTiles.dirtTile1;
		ground_Zero[7][7] = TestingTiles.dirtTile1;
		ground_Zero[7][9] = TestingTiles.dirtTile1;
		ground_Zero[7][10] = TestingTiles.dirtTile1;
		ground_Zero[7][11] = TestingTiles.dirtTile1;
		
		ground_Zero[8][3] = TestingTiles.dirtTile1;
		ground_Zero[8][4] = TestingTiles.dirtTile1;
		ground_Zero[8][5] = TestingTiles.dirtTile1;
		ground_Zero[8][6] = TestingTiles.dirtTile1;
		ground_Zero[8][7] = TestingTiles.dirtTile1;
		ground_Zero[8][8] = TestingTiles.dirtTile1;
		ground_Zero[8][9] = TestingTiles.dirtTile1;
		ground_Zero[8][10] = TestingTiles.dirtTile1;
		ground_Zero[8][11] = TestingTiles.dirtTile1;
		
		ground_Zero[9][3] = TestingTiles.dirtTile1;
		ground_Zero[9][4] = TestingTiles.dirtTile1;
		ground_Zero[9][5] = TestingTiles.dirtTile1;
		ground_Zero[9][6] = TestingTiles.dirtTile1;
		ground_Zero[9][7] = TestingTiles.dirtTile1;
		ground_Zero[9][8] = TestingTiles.dirtTile1;
		ground_Zero[9][9] = TestingTiles.dirtTile1;
		ground_Zero[9][10] = TestingTiles.dirtTile1;
		ground_Zero[9][11] = TestingTiles.dirtTile1;
		
		ground_Zero[10][3] = TestingTiles.dirtTile1;
		ground_Zero[10][4] = TestingTiles.dirtTile1;
		ground_Zero[10][5] = TestingTiles.dirtTile1;
		ground_Zero[10][6] = TestingTiles.dirtTile1;
		ground_Zero[10][7] = TestingTiles.dirtTile1;
		ground_Zero[10][8] = TestingTiles.dirtTile1;
		ground_Zero[10][9] = TestingTiles.dirtTile1;
		ground_Zero[10][10] = TestingTiles.dirtTile1;
		ground_Zero[10][11] = TestingTiles.dirtTile1;
		
		ground_Zero[11][3] = TestingTiles.dirtTile1;
		ground_Zero[11][4] = TestingTiles.dirtTile1;
		ground_Zero[11][5] = TestingTiles.dirtTile1;
		ground_Zero[11][6] = TestingTiles.dirtTile1;
		ground_Zero[11][7] = TestingTiles.dirtTile1;
		ground_Zero[11][8] = TestingTiles.dirtTile1;
		ground_Zero[11][9] = TestingTiles.dirtTile1;
		ground_Zero[11][10] = TestingTiles.dirtTile1;
		ground_Zero[11][11] = TestingTiles.dirtTile1;
		
		ground_Zero[12][3] = TestingTiles.dirtTile1;
		ground_Zero[12][4] = TestingTiles.dirtTile1;
		ground_Zero[12][5] = TestingTiles.dirtTile1;
		ground_Zero[12][6] = TestingTiles.dirtTile1;
		ground_Zero[12][7] = TestingTiles.dirtTile1;
		ground_Zero[12][8] = TestingTiles.dirtTile1;
		ground_Zero[12][9] = TestingTiles.dirtTile1;
		ground_Zero[12][10] = TestingTiles.dirtTile1;
		ground_Zero[12][11] = TestingTiles.dirtTile1;
		
		ground_Zero[13][3] = TestingTiles.dirtTile1;
		ground_Zero[13][4] = TestingTiles.dirtTile1;
		ground_Zero[13][5] = TestingTiles.dirtTile1;
		ground_Zero[13][6] = TestingTiles.dirtTile1;
		ground_Zero[13][7] = TestingTiles.dirtTile1;
		ground_Zero[13][8] = TestingTiles.dirtTile1;
		ground_Zero[13][9] = TestingTiles.dirtTile1;
		ground_Zero[13][10] = TestingTiles.dirtTile1;
		ground_Zero[13][11] = TestingTiles.dirtTile1;
		
		ground_Zero[14][3] = TestingTiles.dirtTile1;
		ground_Zero[14][4] = TestingTiles.dirtTile1;
		ground_Zero[14][5] = TestingTiles.dirtTile1;
		ground_Zero[14][6] = TestingTiles.dirtTile1;
		ground_Zero[14][7] = TestingTiles.dirtTile1;
		ground_Zero[14][8] = TestingTiles.dirtTile1;
		ground_Zero[14][9] = TestingTiles.dirtTile1;
		ground_Zero[14][10] = TestingTiles.dirtTile1;
		ground_Zero[14][11] = TestingTiles.dirtTile1;
		
		ground_Zero[15][3] = TestingTiles.dirtTile1;
		ground_Zero[15][4] = TestingTiles.dirtTile1;
		ground_Zero[15][5] = TestingTiles.dirtTile1;
		ground_Zero[15][6] = TestingTiles.dirtTile1;
		ground_Zero[15][7] = TestingTiles.dirtTile1;
		ground_Zero[15][8] = TestingTiles.dirtTile1;
		ground_Zero[15][9] = TestingTiles.dirtTile1;
		ground_Zero[15][10] = TestingTiles.dirtTile1;
		ground_Zero[15][11] = TestingTiles.dirtTile1;
		
		ground_Zero[16][3] = TestingTiles.dirtTile1;
		ground_Zero[16][4] = TestingTiles.dirtTile1;
		ground_Zero[16][5] = TestingTiles.dirtTile1;
		ground_Zero[16][6] = TestingTiles.dirtTile1;
		ground_Zero[16][7] = TestingTiles.dirtTile1;
		ground_Zero[16][8] = TestingTiles.dirtTile1;
		ground_Zero[16][9] = TestingTiles.dirtTile1;
		ground_Zero[16][10] = TestingTiles.dirtTile1;
		ground_Zero[16][11] = TestingTiles.dirtTile1;
		
		ground_Zero[17][3] = TestingTiles.dirtTile1;
		ground_Zero[17][4] = TestingTiles.dirtTile1;
		ground_Zero[17][5] = TestingTiles.dirtTile1;
		ground_Zero[17][6] = TestingTiles.dirtTile1;
		ground_Zero[17][7] = TestingTiles.dirtTile1;
		ground_Zero[17][8] = TestingTiles.dirtTile1;
		ground_Zero[17][9] = TestingTiles.dirtTile1;
		ground_Zero[17][10] = TestingTiles.dirtTile1;
		ground_Zero[17][11] = TestingTiles.dirtTile1;
		
		ground_Zero[18][3] = TestingTiles.dirtTile1;
		ground_Zero[18][4] = TestingTiles.dirtTile1;
		ground_Zero[18][5] = TestingTiles.dirtTile1;
		ground_Zero[18][6] = TestingTiles.dirtTile1;
		ground_Zero[18][7] = TestingTiles.dirtTile1;
		ground_Zero[18][8] = TestingTiles.dirtTile1;
		ground_Zero[18][9] = TestingTiles.dirtTile1;
		ground_Zero[18][10] = TestingTiles.dirtTile1;
		ground_Zero[18][11] = TestingTiles.dirtTile1;
		
		ground_Zero[19][3] = TestingTiles.dirtTile1;
		ground_Zero[19][4] = TestingTiles.dirtTile1;
		ground_Zero[19][5] = TestingTiles.dirtTile1;
		ground_Zero[19][6] = TestingTiles.dirtTile1;
		ground_Zero[19][7] = TestingTiles.dirtTile1;
		ground_Zero[19][8] = TestingTiles.dirtTile1;
		ground_Zero[19][9] = TestingTiles.dirtTile1;
		ground_Zero[19][10] = TestingTiles.dirtTile1;
		ground_Zero[19][11] = TestingTiles.dirtTile1;

		ground_Zero[20][3] = TestingTiles.dirtTile1;
		ground_Zero[20][4] = TestingTiles.dirtTile1;
		ground_Zero[20][5] = TestingTiles.dirtTile1;
		ground_Zero[20][6] = TestingTiles.dirtTile1;
		ground_Zero[20][7] = TestingTiles.dirtTile1;
		ground_Zero[20][8] = TestingTiles.dirtTile1;
		ground_Zero[20][9] = TestingTiles.dirtTile1;
		ground_Zero[20][10] = TestingTiles.dirtTile1;
		ground_Zero[20][11] = TestingTiles.dirtTile1;

		ground_Zero[21][3] = TestingTiles.dirtTile1;
		ground_Zero[21][4] = TestingTiles.dirtTile1;
		ground_Zero[21][5] = TestingTiles.dirtTile1;
		ground_Zero[21][6] = TestingTiles.dirtTile1;
		ground_Zero[21][7] = TestingTiles.dirtTile1;
		ground_Zero[21][8] = TestingTiles.dirtTile1;
		ground_Zero[21][9] = TestingTiles.dirtTile1;
		ground_Zero[21][10] = TestingTiles.dirtTile1;
		ground_Zero[21][11] = TestingTiles.dirtTile1;

		ground_Zero[22][3] = TestingTiles.dirtTile1;
		ground_Zero[22][4] = TestingTiles.dirtTile1;
		ground_Zero[22][5] = TestingTiles.dirtTile1;
		ground_Zero[22][6] = TestingTiles.dirtTile1;
		ground_Zero[22][7] = TestingTiles.dirtTile1;
		ground_Zero[22][8] = TestingTiles.dirtTile1;
		ground_Zero[22][9] = TestingTiles.dirtTile1;
		ground_Zero[22][10] = TestingTiles.dirtTile1;
		ground_Zero[22][11] = TestingTiles.dirtTile1;

		ground_Zero[23][3] = TestingTiles.dirtTile1;
		ground_Zero[23][4] = TestingTiles.dirtTile1;
		ground_Zero[23][5] = TestingTiles.dirtTile1;
		ground_Zero[23][6] = TestingTiles.dirtTile1;
		ground_Zero[23][7] = TestingTiles.dirtTile1;
		ground_Zero[23][8] = TestingTiles.dirtTile1;
		ground_Zero[23][9] = TestingTiles.dirtTile1;
		ground_Zero[23][10] = TestingTiles.dirtTile1;
		ground_Zero[23][11] = TestingTiles.dirtTile1;

		ground_Zero[24][3] = TestingTiles.dirtTile1;
		ground_Zero[24][4] = TestingTiles.dirtTile1;
		ground_Zero[24][5] = TestingTiles.dirtTile1;
		ground_Zero[24][6] = TestingTiles.dirtTile1;
		ground_Zero[24][7] = TestingTiles.dirtTile1;
		ground_Zero[24][8] = TestingTiles.dirtTile1;
		ground_Zero[24][9] = TestingTiles.dirtTile1;
		ground_Zero[24][10] = TestingTiles.dirtTile1;
		ground_Zero[24][11] = TestingTiles.dirtTile1;
		
		ground_Zero[25][3] = TestingTiles.dirtTile1;
		ground_Zero[25][4] = TestingTiles.dirtTile1;
		ground_Zero[25][5] = TestingTiles.dirtTile1;
		ground_Zero[25][6] = TestingTiles.dirtTile1;
		ground_Zero[25][7] = TestingTiles.dirtTile1;
		ground_Zero[25][8] = TestingTiles.dirtTile1;
		ground_Zero[25][9] = TestingTiles.dirtTile1;
		ground_Zero[25][10] = TestingTiles.dirtTile1;
		ground_Zero[25][11] = TestingTiles.dirtTile1;
		
		ground_Zero[26][3] = TestingTiles.dirtTile1;
		ground_Zero[26][4] = TestingTiles.dirtTile1;
		ground_Zero[26][5] = TestingTiles.dirtTile1;
		ground_Zero[26][6] = TestingTiles.dirtTile1;
		ground_Zero[26][7] = TestingTiles.dirtTile1;
		ground_Zero[26][8] = TestingTiles.dirtTile1;
		ground_Zero[26][9] = TestingTiles.dirtTile1;
		ground_Zero[26][10] = TestingTiles.dirtTile1;
		ground_Zero[26][11] = TestingTiles.dirtTile1;
		
		ground_Zero[27][4] = TestingTiles.dirtTile1;
		ground_Zero[27][5] = TestingTiles.dirtTile1;
		ground_Zero[27][6] = TestingTiles.dirtTile1;
		ground_Zero[27][7] = TestingTiles.dirtTile1;
		ground_Zero[27][8] = TestingTiles.dirtTile1;
		ground_Zero[27][9] = TestingTiles.dirtTile1;
		ground_Zero[27][10] = TestingTiles.dirtTile1;
		
		ground_Zero[3][13] = TestingTiles.dirtTile1;
		ground_Zero[2][13] = TestingTiles.dirtTile1;
		ground_Zero[3][12] = TestingTiles.dirtTile1;
		
		MapStuff.Mapping.setMap(ground_Zero);
	}
}
