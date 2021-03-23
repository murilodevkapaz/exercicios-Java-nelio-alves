package entities;

public abstract class TaxPayer {
	protected String name;
	protected Double anualIncome;
	
	public TaxPayer(String name, double anualIncome) {
		this.name=name;
		this.anualIncome = anualIncome;
	}
	
	public TaxPayer() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double TaxPaid();
}
