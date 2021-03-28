package entities.services;

import model.entities.Installment;

public interface TaxService {
	public Installment tax(int installmentNumber, Installment installment);
}
