package com.robert.abstractclass;

public abstract class Payment {
	protected double amount;

	public Payment(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void paymentDetails() {
		System.out.println("amount: " + this.amount);
	}
	
	
}
