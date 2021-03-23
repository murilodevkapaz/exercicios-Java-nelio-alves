package model.entities;

import model.exceptions.DomainAccountException;

public class Account {
	
	//attributes
	private Integer number = 0;
	private String holder = "";
	private Double balance = null;
	private Double withdrawLimit = null;

	//constructor
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Account() {
		
	}

	//getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getwithdrawLimit() {
		return withdrawLimit;
	}

	public void setwithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	//methods
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws DomainAccountException{
		if(amount > withdrawLimit) {
			throw new DomainAccountException("Whithdraw error: The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainAccountException("Withdra error: Not enough balance");
		}		
		this.balance -= amount;
	}
}