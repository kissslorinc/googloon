package googloon;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	
	
	public static Tile[][] map;
	public static List<Loon> loons = new ArrayList<Loon>();
	public static List<Vertex> vertices = new ArrayList<Vertex>();
	private static int radius;
	static int w, a, h;
	
	public static void initParameters(int w, int h, int a){
		DataStore.w= w;
		DataStore.a = a + 1;
		DataStore.h= h;
	}
	
	public static int score(){
		int score = 0;
		for (int i=0; i<map.length; i++){
			for (int j = 0; j<map[i].length; j++){
				score += map[i][j].isOnline();
			}
		}
		return score;
	}
	
	public static void cycle(){
		int i = 0;
		while (i<loons.size()){
			if (getVertexAt(loons.get(i).getPos(Coord.X), loons.get(i).getPos(Coord.Y), loons.get(i).getPos(Coord.Z)).nextVertex(loons.get(i).nextStep) == null){
				loons.remove(i);
			}
			else {
				loons.get(i).x = (getVertexAt(loons.get(i).getPos(Coord.X), loons.get(i).getPos(Coord.Y), loons.get(i).getPos(Coord.Z)).nextVertex(loons.get(i).nextStep)).x;
				loons.get(i).y = (getVertexAt(loons.get(i).getPos(Coord.X), loons.get(i).getPos(Coord.Y), loons.get(i).getPos(Coord.Z)).nextVertex(loons.get(i).nextStep)).y;
				loons.get(i).z = (getVertexAt(loons.get(i).getPos(Coord.X), loons.get(i).getPos(Coord.Y), loons.get(i).getPos(Coord.Z)).nextVertex(loons.get(i).nextStep)).z;
				i++;
			}
		}
	}
	
	public static Vertex getVertexAt(int x, int y, int z){
		return DataStore.vertices.get(z+(x%w)*a + y*w*a);
	}
	
	public static int getRadius(){
		return radius;
	}
	
}
