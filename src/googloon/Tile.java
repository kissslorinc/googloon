package googloon;

import java.util.ArrayList;

public class Tile {
	
	final int x, y;
	boolean important; 
	private ArrayList<Vertex> vertices;
	
	public Tile(int _x, int _y, boolean _important) {
		x=_x;
		y=_y;
		important=_important;
		vertices=new ArrayList<Vertex>();
	}
	
	public void initVertices() {
		for (int i=0;i<DataStore.a;i++)
			vertices.add(DataStore.getVertexAt(x, y, i));
	}
	
	public int getPos(Coord c) {
		switch(c) {
		case X:
			return x;
		case Y:
			return y;
		default:
			return -1;
		}
	}
	
	public int isOnline() {
		for (Loon l : DataStore.loons) {
			if (l.isOver(x, y)) return 1;
		}
		return 0;
	}
	
	public ArrayList<Vertex> vertices() {
		return vertices;
	}
	
	public int value() {
		int value=0;
		for (int i=0;i<DataStore.map.length;i++) {
			for (int j = 0; j < DataStore.map[0].length; j++) {
				Tile currTile=DataStore.map[i][j];
				value += (currTile.important && ((x-currTile.x)*(x-currTile.x)+Math.pow(Math.min(Math.abs(y-currTile.y), DataStore.w-Math.abs(y-currTile.y)),2))<=Math.pow(DataStore.getRadius(),2))?1:0;
			}
		}
		return value;
	}
	
	
 }
