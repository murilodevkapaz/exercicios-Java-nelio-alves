package models.entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	

}
