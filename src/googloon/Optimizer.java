package googloon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Optimizer {
	
	public int run(HashMap<String, Integer> params){
		ArrayList<Vertex> vertices = new DFS(DataStore.loons.get(0).getVertex()).availableVertices();
		HashSet<Tile> tileSet = new HashSet<>();
		for(Vertex v : vertices){
			tileSet.add(v.tileUnder());
		}
		TreeMap<Integer, Tile> tileTree = new TreeMap<>();
		for(Tile tile : tileSet){
			tileTree.put(tile.value(),tile);
		}
		for(Loon l : DataStore.loons){
			//l.setDestinaton();
		}
		
		return 0;
	}
	
}
