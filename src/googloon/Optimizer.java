package googloon;

import java.util.ArrayList;
import java.util.HashMap;

public class Optimizer {
	public int run(HashMap<String, Integer> params){
		DijkstraAlgorithm dij = new DijkstraAlgorithm((ArrayList<Vertex>) DataStore.vertices);
		dij.execute(DataStore.loons.get(0).getVertex());
		return 0;
	}
}
