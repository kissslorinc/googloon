package googloon;

public class Googloon {

	public static void main(String[] args) {
		Parser.read("in.txt");
		Optimizer ultimateSuperOptimizer = new Optimizer();
		ultimateSuperOptimizer.run(null);

	}

}
