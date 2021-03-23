package services;

import java.util.List;

import entities.Employee;

public class ActionsEmployee {
	public static Integer position(int id,  List<Employee> employees) {
		
		for(int i =0; i< employees.size(); i++) {
			if(id == employees.get(i).getId()) {
				return i;
			}
		}
		return null;
		
	}

}
