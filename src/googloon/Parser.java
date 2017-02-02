package googloon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Parser {
	static FileWriter fw=null;
	
	
	static void read(String path) {
		try {
			FileReader fr=new FileReader(path);
			Scanner sc=new Scanner(fr);
			
			String[] row=sc.nextLine().split(" ");
			int w=Integer.parseInt(row[0]);
			int h=Integer.parseInt(row[1]);
			int a=Integer.parseInt(row[2]);
			a++;
			row=sc.nextLine().split(" ");
			int targetc=Integer.parseInt(row[0]);
			int r=Integer.parseInt(row[1]);
			int loonnum=Integer.parseInt(row[2]);
			int turns=Integer.parseInt(row[3]);
			
			DataStore.initParameters(w,h,a,r);
			DataStore.turns=turns;

			row=sc.nextLine().split(" ");
			int starty=Integer.parseInt(row[0]);
			int startx=Integer.parseInt(row[1]);
			for (int i = 0; i < loonnum; i++)
				DataStore.loons.add(new Loon(startx,starty));
			
			for (int i=0;i<targetc;i++) {
				row=sc.nextLine().split(" ");
				int tcelly=Integer.parseInt(row[0]);
				int tcellx=Integer.parseInt(row[1]);
				DataStore.map[tcellx][tcelly].important=true;
			}
			
			Vertex[][][] inVertices=new Vertex[w][h][a];
			for (int i=1;i<a;i++)
				for (int j = 0; j < h; j++) {
					row=sc.nextLine().split(" ");
					for (int k = 0; k < row.length; k+=2) {
						inVertices[k/2][j][i]=new Vertex(k/2,j,i,Integer.parseInt(row[k%2]),Integer.parseInt(row[k%2+1]));
					}
				}
			
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					inVertices[i][j][0]=new Vertex(i,j,0,0,0);
				}
			}
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					for (int k = 0; k < a; k++) {
						DataStore.vertices.add(inVertices[j][h][a]);
					}
				}
			}		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static void start() { }
	static void write() { }
	static void finish() {
		fw=null;
	}
}
