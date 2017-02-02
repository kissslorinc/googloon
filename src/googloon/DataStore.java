package googloon;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	
	public static List<Vertex> vertexes = new ArrayList<Vertex>();
	static int w, alt, h;
	
	public void initParameters(int w, int h, int alt){
		DataStore.w= w;
		DataStore.alt = alt;
		DataStore.h= h;
	}
	
	private static void initVertexList(){
		for (int i=0; i<h; i++){
			for (int j = 0; j<w; j++){
				for (int k=0; k<h; k++){
					vertexes.add(new Vertex());
				}
			}
		}
	}
	
	public static Vertex getVertexAt(int x, int y, int z){
		return vertexes.get(z+x*alt + y*w*alt);
	}
	
}
