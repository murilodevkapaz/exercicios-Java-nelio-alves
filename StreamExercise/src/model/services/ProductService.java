package model.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import models.entities.Product;

public class ProductService {
	public static double average(List<Product> p) {
		int qtdProducts = p.size();

		Double average = p.stream()
				.map(prod-> prod.getPrice())
				.reduce(0.0, (x, y) -> x+y)/ qtdProducts;
		
		return average;
	}
	public static List<String> orderProducts(double average, List<Product> p ){
		Comparator<String> comp = (s1, s2)->s1.toUpperCase().compareTo(s2.toUpperCase());
		List<String> nameProducts = p
				.stream()
				.filter(prod-> prod.getPrice() <= average)
				.map(prod->prod.getName())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		
		return nameProducts;
	}
	
}
