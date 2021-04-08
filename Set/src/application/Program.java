package application;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import models.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<Product> set = new TreeSet<>();
		set.add(new Product("Tablet", 2000.00));
		set.add(new Product("Pc", 3000.00));
		set.add(new Product("Notebook", 6000.00));
		
		Product prod1 = new Product("Pc", 3000.00);
		
		System.out.println(set.contains(prod1));
		
		for(Product prod : set) System.out.println(prod);
	}

}
