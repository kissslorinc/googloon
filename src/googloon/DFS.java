package googloon;

import java.util.ArrayList;
import java.util.HashMap;

public class DFS {
	HashMap<Vertex, Integer> depth;
	HashMap<Vertex, Integer> finish;
	HashMap<Vertex, Vertex> previous;
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
		maxDepth = 1;
		maxFinish = 0;
		
		execute(start);
	}
	
	private void execute(Vertex active){
		for(Vertex v : active.getNeighbours()){
			if(depth.get(v) == Integer.MAX_VALUE){
				maxDepth++;
				depth.put(v, maxDepth);
				previous.put(v, active);
				execute(v);
			}
		}
		maxFinish++;
		finish.put(active, maxFinish);
		if(previous.get(active) == null){
			execute(previous.get(active));
		}
	}
	
	public ArrayList<Vertex> availableVertices(){
		ArrayList<Vertex> ret = new ArrayList<Vertex>();
		for(Vertex v : finish.keySet()){
			if(finish.get(v) != Integer.MAX_VALUE){
				ret.add(v);
			}
		}
		return ret;
	}
	
}
