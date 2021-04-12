package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import models.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
		List<String> names = list
				.stream()
				.map(fun-> fun.getName().toUpperCase())
				.collect(Collectors.toList());
		//é uma lista de produtos que transforma em uma lista de string somente dos nomes, transformando em caixa alta
		
		names.forEach(System.out::println);
	}
	
	
	


}
