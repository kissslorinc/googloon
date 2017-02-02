package googloon;

public class Vertex {
	
	Vertex plus;
	Vertex minus;
	Vertex zero;
	
	int x;
	int y;
	int z;
	
	public Vertex(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void initVertex(Vertex p, Vertex m, Vertex z){
		plus = p;
		minus = m;
		zero = z;
	}
	
	public Vertex nextVertex(int direction){
		switch (direction) {
		case 0: return zero;
		case 1: return plus;
		case -1: return minus; }
		return null;
	}
	
	public int getPos(Coord c){
		return 0;
	}
	
	
}
