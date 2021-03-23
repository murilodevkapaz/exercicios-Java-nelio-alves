package entities;

public class PhisicalPerson extends TaxPayer {

	private Double healthExpenditures;
	
	public PhisicalPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhisicalPerson(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
		// TODO Auto-generated constructor stub
	}
	
	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double TaxPaid() {
		double tax;
		double health = healthExpenditures * 50/100;
		if(anualIncome<20000) {
			tax = anualIncome*15/100;
		}
		else {
			tax = anualIncome*25/100;
		}
		tax = tax-health;
		
		return tax;
	}

}
