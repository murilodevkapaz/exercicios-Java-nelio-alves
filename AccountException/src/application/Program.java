package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainAccountException;

public class Program {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account data: ");
		
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			
			System.out.print("Holder: ");
			String holder = sc.next();
		
			System.out.print("Initial Balance: ");
			Double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			
			account.withdraw(withdraw);
			
			System.out.print("New balance: "+ account.getBalance());
		}
		catch(DomainAccountException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error: "+ e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
