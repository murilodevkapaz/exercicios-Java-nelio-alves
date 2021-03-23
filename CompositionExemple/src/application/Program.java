package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.next();
		
		System.out.println("Enter worker data: ");
		
		System.out.print("name: ");
		String workerName = sc.next();
		
		System.out.print("Level: ");
		String workerLevel = sc.next();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker woker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
	}

}
