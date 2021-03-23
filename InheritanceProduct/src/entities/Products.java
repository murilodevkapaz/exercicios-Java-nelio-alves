package entities;

public class Products {
	protected String name;
	protected Double price;
	
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Products() {
		
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
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ "+ String.format("%.2f", price));
		return sb.toString();
	}
	
	
	
}
