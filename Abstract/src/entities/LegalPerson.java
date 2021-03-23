package entities;

public class LegalPerson extends TaxPayer{

	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}
	public LegalPerson(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;

	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double TaxPaid() {
		double tax;
		if(numberOfEmployees > 10) {
			tax = anualIncome * 14/100;
		}
		else {
			tax = anualIncome *16/100;
		}
		return tax;
	}

}
