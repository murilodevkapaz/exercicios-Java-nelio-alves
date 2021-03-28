package entities.services;


public class PaymentService {
	public TaxService taxService;
	
	public PaymentService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	
}
