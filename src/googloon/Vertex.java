package googloon;

public class Vertex {
		
	int x;
	int y;
	int z;
	
	int windX;
	int windY;
	
	public Vertex(int x, int y, int z, int windy, int windx){
		this.x = x;
		this.y = y;
		this.z = z;
		windX  = windx;
		windY = windy;
	}
	
	public void initVertex(int x, int y){
	
	}
	
	public Vertex nextVertex(int direction){
		
		
		
	/*else*/ return DataStore.getVertexAt(this.y + windY ,this.x + windX ,this.z + direction);
	}
	
	public int getPos(Coord c){
		switch (c){
		case X: return this.x;
		case Y: return this.y;
		case Z: return this.z;
		}
		return -1;
	}
}
