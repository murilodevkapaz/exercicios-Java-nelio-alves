package model.exceptions;

public class DomainAccountException extends Exception {

	private static final long serialVersionUID = 1L;
	public String msg;
	
	public DomainAccountException(String msg) {
		super(msg);
	}
	
}
