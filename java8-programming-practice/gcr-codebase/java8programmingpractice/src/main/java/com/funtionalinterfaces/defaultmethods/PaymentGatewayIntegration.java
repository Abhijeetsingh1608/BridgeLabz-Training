package com.funtionalinterfaces.defaultmethods;

public class PaymentGatewayIntegration {
		interface PaymentProcessor {
		void processPayment(double amount);

		default void refund(double amount) {
			System.out.println("Refunded " + amount + " using default refund method.");
		}
	}

	static class PayPalProcessor implements PaymentProcessor {
		public void processPayment(double amount) {
			System.out.println("Processed payment of " + amount + " via PayPal.");
		}
	}

	static class StripeProcessor implements PaymentProcessor {
		public void processPayment(double amount) {
			System.out.println("Processed payment of " + amount + " via Stripe.");
		}

		public void refund(double amount) {
			System.out.println("Refunded " + amount + " via Stripe's custom refund method.");
		}
	}

	public static void main(String[] args) {
		PaymentProcessor paypal = new PayPalProcessor();
		PaymentProcessor stripe = new StripeProcessor();

		paypal.processPayment(100.0);
		paypal.refund(50.0);

		stripe.processPayment(200.0);
		stripe.refund(75.0);
	}

}
