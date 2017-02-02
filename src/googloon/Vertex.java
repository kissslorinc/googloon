package googloon;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	int x;
	int y;
	int z;

	int windX;
	int windY;

	public Vertex(int x, int y, int z, int windy, int windx) {
		this.x = x;
		this.y = y;
		this.z = z;
		windX = windx;
		windY = windy;
	}

	public Vertex nextVertex(int dir) {
		switch (dir) {
		case -1:
			if (z == 1 || z == 0) {
				return null;
			}

		case 1:
			if (this.z == DataStore.a) {
				return null;
			}
		}
		if ((y + DataStore.getVertexAt(x, y, z + dir).windY) <= 0
				|| (y + DataStore.getVertexAt(x, y, z + dir).windY) >= DataStore.a) {
			return null;
		}
		return DataStore.getVertexAt(DataStore.getVertexAt(x, y, z + dir).windX + x,
				DataStore.getVertexAt(x, y, z + dir).windY + y, z + dir);
	}

	public int getPos(Coord c) {
		switch (c) {
		case X:
			return this.x;
		case Y:
			return this.y;
		case Z:
			return this.z;
		}
		return -1;
	}
	
	public Tile tileUnder(){
		return DataStore.map[x][y]; 
	}
	
	public ArrayList<Vertex> getNeighbours(){
		ArrayList<Vertex> neighbours = new ArrayList<Vertex>();
        if(this.nextVertex(-1) != null)
        	neighbours.add(this.nextVertex(-1));
        if(this.nextVertex(0) != null)
        	neighbours.add(this.nextVertex(0));
        if(this.nextVertex(1) != null)
        	neighbours.add(this.nextVertex(1));
        return neighbours;
	}
}
