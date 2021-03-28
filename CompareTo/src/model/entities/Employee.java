package model.entities;

public class Employee implements Comparable<Employee> {
	private String name;
	private Double salary;
	
	public Employee(String name, double salary) {
		this.name= name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: "+name);
		sb.append(", salary: "+ String.format("%.2f%n", salary));
		return sb.toString();
	}
}
