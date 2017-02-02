package googloon;

import java.util.HashMap;

public class DFS {
	HashMap<Vertex, Integer> depth;
	HashMap<Vertex, Integer> finish;
	HashMap<Vertex, Vertex> previous;
	Vertex active;
	int maxDepth;
	int maxFinish;
	Vertex start;
	
	public DFS(Vertex s){
		start = s;
		
		//setup
		depth.put(start, 1);
		finish.put(start, Integer.MAX_VALUE);
		previous.put(start, null);
		for(Vertex v: DataStore.vertices){
			if(!v.equals(start)){
				depth.put(v, Integer.MAX_VALUE);
				finish.put(v, Integer.MAX_VALUE);
				previous.put(v, null);
			}
		}
		active = start;
		maxDepth = 1;
		maxFinish = 0;
		
		//execution
		for(Vertex v : active.getNeighbours()){
			if(depth.get(v) = )
		}
	}
	
	
}
