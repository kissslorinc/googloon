package googloon;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	
	
	public static Tile[][] map;
	public static List<Vertex> vertices = new ArrayList<Vertex>();
	private static int radius;
	static int w, a, h;
	
	public void initParameters(int w, int h, int alt){
		DataStore.w= w;
		DataStore.a = alt + 1;
		DataStore.h= h;
	}
	
	private static void initVertexes(){
		
	}
	
	public static int score(){
		return 0;
	}
	
	public static void cycle(){
		
	}
	
	
	
	public static Vertex getVertexAt(int x, int y, int z){
		return DataStore.vertices.get(z+x*a + y*w*a);
	}
	
	public static int getRadius(){
		return radius;
	}
	
}
