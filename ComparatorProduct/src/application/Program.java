package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//implementação utilizando classe anonima
		/*
		 * Comparator<Product> comp = (p1, p2)->{ return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 */
		
		list.sort((p1, p2)->{
			return (p1
					.getName()
					.toUpperCase()
					.compareTo(p2.getName().toUpperCase())
					);
		});

		for (Product p : list)
			System.out.println(p);
		
		list.sort(Program::compareProduct);
		list.forEach(System.out::println);

	}
	
	
	
	static int compareProduct(Product p1, Product p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
