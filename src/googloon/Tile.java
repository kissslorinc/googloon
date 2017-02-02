package googloon;

import java.util.ArrayList;

public class Tile {
	
	final int x, y;
	final boolean important; 
	private ArrayList<Vertex> vertices;
	
	Tile(int _x, int _y, boolean _important) {
		x=_x;
		y=_y;
		important=_important;
		vertices=new ArrayList<Vertex>();
		for (int i=0;i<=DataStore.a;i++)
			vertices.add(DataStore.getVertexAt(_x, _y, i));
	}
	
	int getPos(Coord c) {
		switch(c) {
		case X:
			return x;
		case Y:
			return y;
		}
		return -1;
	}
	
	int isOnline() {
		for (Loon l : DataStore.loons) {
			if (l.isOver(x, y)) return 1;
		}
		return 0;
	}
	
	ArrayList<Vertex> vertices() {
		return vertices;
	}
	
 }
