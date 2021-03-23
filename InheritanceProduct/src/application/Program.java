package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> p = new ArrayList<>();
		
		System.out.print("Enter with number of products: ");
		int nProd = sc.nextInt();
		
		for(int i = 1; i<= nProd; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, Used or Imported (c/u/i): ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch(type) {
			case 'c':
				p.add(new Products(name, price));
				break;
			case 'i':
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				p.add(new ImportedProduct(name, price, customsFee));
				break;
			case 'u':
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String d = sc.next();
				Date date = sdf.parse(d);
				p.add(new UsedProduct(name, price, date));
				break;
			}

		}
		for(Products prod: p) {
			if(prod instanceof Products) System.out.println(prod.priceTag());
			
			else if(prod instanceof ImportedProduct) {
				ImportedProduct imp = (ImportedProduct) prod;
				System.out.println(imp.priceTag());
			}
			else {
				UsedProduct used = (UsedProduct) prod;
				System.out.println(used.priceTag());
			}
		}
		

		
		sc.close();
	}

}
