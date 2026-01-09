package com.Scenariobased.MediStore;

import java.time.LocalDate;

public class MedicineMain {
	public static void main(String args[]) {
		ISellable med1 = new Tablet("Paracetamol", 5, LocalDate.of(2026, 5, 10));
        ISellable med2 = new Syrup("Cough Syrup", 120, LocalDate.of(2025, 2, 1));

        med1.sell(20);
        med1.checkExpiry();

        System.out.println("-----------");

        med2.sell(5);
        med2.checkExpiry();
	}

}