package models.services;

import java.util.List;
import java.util.stream.Collectors;

import models.entities.Employee;

public class EmployeeService {

	public static List<String> catchEmailBySalary(double minWage,List<Employee> employees) {

		List<String> emails = employees
				.stream()
				.filter(emp-> emp.getSalary()>minWage)
				.map(emp-> emp.getEmail())
				.sorted()
				.collect(Collectors.toList());

		return emails;
	}
	
	public static Double sumSalaryByLetter(List<Employee> employee) {
		Double sum = employee
				.stream()
				.filter(emp-> emp.getName().charAt(0) == 'M')
				.map(emp-> emp.getSalary())
				.reduce(0.0, (x,y)-> x+y);		
		return sum;
	}

}
