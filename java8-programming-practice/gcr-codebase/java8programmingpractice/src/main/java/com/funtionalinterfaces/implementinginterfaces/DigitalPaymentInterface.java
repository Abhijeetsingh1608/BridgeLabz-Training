package com.funtionalinterfaces.implementinginterfaces;

public class DigitalPaymentInterface {
	interface DigitalPayment {
		void pay(double amount);
	}

	static class UpiPayment implements DigitalPayment {
		public void pay(double amount) {
			System.out.println("Paid " + amount + " using UPI.");
		}
	}

	static class CreditCardPayment implements DigitalPayment {
		public void pay(double amount) {
			System.out.println("Paid " + amount + " using Credit Card.");
		}
	}

	static class WalletPayment implements DigitalPayment {
		public void pay(double amount) {
			System.out.println("Paid " + amount + " using Wallet.");
		}
	}

	public static void main(String[] args) {
		DigitalPayment upi = new UpiPayment();
		DigitalPayment creditCard = new CreditCardPayment();
		DigitalPayment wallet = new WalletPayment();

		upi.pay(500.0);
		creditCard.pay(1500.0);
		wallet.pay(300.0);
	}

}
