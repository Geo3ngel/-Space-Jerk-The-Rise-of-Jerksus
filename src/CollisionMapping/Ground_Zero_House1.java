package CollisionMapping;

import java.awt.Point;
import java.awt.image.BufferedImage;

import ObjMaps.Objects;

public class Ground_Zero_House1 {
public static CollisionBlocks[] ground_Zero_House1 = new CollisionBlocks[16];
	
	public static void initializeGround_Zero_House1() {
		//ObjMaps.LoadTileObjects.MapChangeTo(30, 16);
		
		ground_Zero_House1[2] = GameEngine.CollisionBlocks.getCollisionBlocks(2,2);
		
		//ObjMaps.LoadTileObjects.setObjMap(ground_Zero_House1);
	}
}
