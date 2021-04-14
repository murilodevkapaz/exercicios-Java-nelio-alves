package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Employee;
import models.services.EmployeeService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		List<Employee> employees = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null){
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				
				employees.add(new Employee(name, email, salary));
				
				System.out.println(line);
				
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			Double minWage = sc.nextDouble();
			List<String> emails = EmployeeService.catchEmailBySalary(minWage, employees);
			
			System.out.printf("Email of people whose salary is more than $ %.2f:%n", minWage);
			emails.forEach(System.out::println);
			
			System.out.print("Sum of salary of people whose name starts with 'M': ");
			double sum = EmployeeService.sumSalaryByLetter(employees);
			System.out.printf("%.2f", sum);
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}
