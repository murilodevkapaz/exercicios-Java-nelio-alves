package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import services.ActionsEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int qtdEmployes = sc.nextInt();

		List<Employee> employees = new ArrayList<>();

		for (int i = 0; i < qtdEmployes; i++) {
			System.out.println("EMPLOYE #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Nome: ");
			String name = sc.next();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			employees.add(new Employee(id, name, salary));

			System.out.println("----------------");
		}

		System.out.print("Enter the employee id that will have a salary increase: ");
		int id = sc.nextInt();
		Integer pos = ActionsEmployee.position(id, employees);
		if (pos == null)
			System.out.println("Id não encontrado");
		else {
			System.out.print("Enter a percentage: ");
			double percent = sc.nextDouble();
			employees.get(pos).increaseSalary(percent);

		}

		for (Employee e : employees)
			System.out.println(e.toString());

		sc.close();

	}

}
