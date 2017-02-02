package googloon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Parser {
	static FileWriter fw=null;
	
	
	static void read(String path) {
		try {
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);
			
			String[] row=br.readLine().split(" ");
			DataStore.
			
			
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
