package googloon;

public class Loon {
	int x,y,z,nextStep;
	
	Loon(int _x, int _y) {
		x=_x;
		y=_y;
		z = 0;
	}
	
	
	public int getPos(Coord c) {
		switch(c) {
		case X:
			return x;
		case Y:
			return y;
		case Z: 
			return z;
		}
		return -1;
	}
	
	public void move(int i) {
		nextStep = i;
	}
	
	public boolean isOver(int tx, int ty) {
		int r=1;
		return (x-tx)*(x-tx)+(Math.min(Math.abs(y-ty), DataStore.w-Math.abs(y-ty) ))<=r;
		}
	
	public Tile getTileUnder() {
		return DataStore.map[x][y];
		}	
}
