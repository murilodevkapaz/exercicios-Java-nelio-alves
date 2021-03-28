package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Users\\OSASSP01\\Documents\\employees.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			List<Employee> emp = new ArrayList<>();
			
			
			while(line != null) {
				String[] fields = line.split(",");
				emp.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Collections.sort(emp);
			
			for(Employee employee: emp) {
				System.out.println(employee.toString());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}

}
