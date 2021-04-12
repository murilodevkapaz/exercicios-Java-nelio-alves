package application;

import java.util.ArrayList;
import java.util.List;

import models.entities.Product;
import models.service.ProductService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
		ProductService ps = new ProductService();
		
		double sum = ps.fiteredSum(list, prod->prod.getName().charAt(0) == 'T');
		
		System.out.printf("%.2f", sum);
	}
	
	
	


}
