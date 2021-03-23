package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhisicalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double totalTaxes = 0f;
		List<TaxPayer> tp = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numTaxPayers = sc.nextInt();
		
		for(int i=1;i<=numTaxPayers;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company? ");
			char typePerson = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			switch(typePerson) {
			case 'c':
				System.out.print("Number of employes: ");
				int numberOfEmployes = sc.nextInt();
				
				tp.add(new LegalPerson(name, anualIncome, numberOfEmployes));
				break;
			case 'i':
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				tp.add(new PhisicalPerson(name, anualIncome, healthExpenditures));
				break;
			}
		}
		
		
		for(TaxPayer payer: tp) {
			double tax;
			if(payer instanceof PhisicalPerson) {
				tax= payer.TaxPaid();
			}
			else {
				tax= payer.TaxPaid();
			}
			totalTaxes+=tax;
			System.out.printf("%s: $ %.2f%n", payer.getName(), tax);
		}
		
		System.out.println("TOTAL TAXES: $"+totalTaxes);
		
		sc.close();
	}

}
