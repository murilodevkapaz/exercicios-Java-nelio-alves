package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.services.ProductService;
import models.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			List<Product> products = new ArrayList<>();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			

			Double average = ProductService.average(products);
			
			System.out.printf("Average Price: R$: %.2f%n%n",average);
			ProductService.orderProducts(average, products).forEach(System.out::println);
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
