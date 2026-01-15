package com.Scenariobased.payxpress;

import java.time.LocalDate;
public class PayXpreassMain {
	 public static void main(String[] args) {

	        Bill electricity = new ElectricityBill(1200, LocalDate.now().plusDays(3));
	        Bill water = new WaterBill(400, LocalDate.now().plusDays(5));
	        Bill internet = new InternetBill(999, LocalDate.now().plusDays(2));

	        // Polymorphic reminders
	        electricity.sendReminder();
	        water.sendReminder();
	        internet.sendReminder();

	        // Pay bill
	        electricity.pay();

	        // Late fee calculation
	        double lateAmount = internet.calculateLateFee(100);
	        System.out.println("Internet bill with late fee: ₹" + lateAmount);
	    }

}
