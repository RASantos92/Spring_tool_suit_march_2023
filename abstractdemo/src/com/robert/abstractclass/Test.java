package com.robert.abstractclass;

public class Test {

	public static void main(String[] args) {
//		Payment payment1 = new Payment(19.90);
		CashPayment laptop = new CashPayment(2000.99);
		
		System.out.println(laptop.getAmount());
		
		
		CreditCardPayment ccpayment1 = new CreditCardPayment("43424564", "Robert", "03/08", 1000.99);
		
		ccpayment1.paymentDetails();

	}

}
