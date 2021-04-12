package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import models.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		double factor = 1.1;

		list.forEach(consum-> consum.setPrice(consum.getPrice()*factor));

		list.forEach(System.out::println);
	}
	
	
	


}
