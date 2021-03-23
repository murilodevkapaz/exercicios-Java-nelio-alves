package entities;

public class ImportedProduct extends Products{
	private Double customsFee;
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public ImportedProduct() {
		super();
	}
	
	public double getCustomsFee() {
		return this.customsFee;
	}
	
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ "+ String.format("%.2f", price + customsFee));
		sb.append("\nCustoms fee: "+ String.format("%.2f", customsFee));
		return sb.toString();
	}
}
