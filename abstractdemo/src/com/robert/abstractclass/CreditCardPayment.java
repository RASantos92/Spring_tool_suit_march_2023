package com.robert.abstractclass;

public class CreditCardPayment extends Payment {
	
	private String cardNum, ownerName, expDate;

	public CreditCardPayment(String cardNum, String ownerName, String expDate, double amount) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}
	
	
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("Card number: " + this.cardNum + " owner Name: " + this.ownerName + " expDate: " + this.expDate );
	}
	

}
