package application;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		PrintService<Integer> ps = new PrintService<>();
		
		ps.addValue(1);
		ps.addValue(2);
		ps.addValue(3);
		
		ps.print();

	}

}
