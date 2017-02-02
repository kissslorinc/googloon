package googloon;

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

	public Vertex nextVertex(int direction) {
		switch (direction) {
		case -1:
			if (z == 1 || z == 0) {
				return null;
			}

		case 1:
			if (this.z == DataStore.a) {
				return null;
			}
		}
		if ((y + DataStore.getVertexAt(x, y, z + direction).windY) <= 0
				|| (y + DataStore.getVertexAt(x, y, z + direction).windY) >= DataStore.a) {
			return null;
		}
		return DataStore.getVertexAt(DataStore.getVertexAt(x, y, z + direction).windX + x,
				DataStore.getVertexAt(x, y, z + direction).windY + y, z + direction);
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
}
