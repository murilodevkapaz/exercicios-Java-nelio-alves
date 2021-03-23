package entities;

public class Employee {
	
	//attributes
	private Integer id;
	private String name;
	private Double salary;
	
	
	//constructor
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//getters and setters
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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
	
	//methods
	
	public void increaseSalary(double percent){
		salary += salary * percent/100.0;
	}
	
	public String toString() {
		return "Id: "+ id+", Name: "+ name+", Salary: "+salary;
	}
	
	
}
