package entities.services;

import java.util.Calendar;

import model.entities.Installment;

public class PaypalTax implements TaxService{

	@Override
	public Installment tax(int installmentNumber, Installment installment) {
		
		double valueInstallment = installment.getAmount();
		double res = (valueInstallment * 1/100 * installmentNumber + valueInstallment) + (valueInstallment * 2/100);

		Calendar cal = Calendar.getInstance();
		cal.setTime(installment.getDueDate());
		cal.add(Calendar.MONTH, installmentNumber);
		Installment inst = new Installment(cal.getTime(), res);
		
		return inst;
	}

}
