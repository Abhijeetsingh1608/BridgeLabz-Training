package com.Scenariobased.MediStore;

import java.time.LocalDate;

public class Syrup extends Medicine {
	public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    // Liquids spoil faster
    @Override
    public void checkExpiry() {
        System.out.println("⚠ Syrup expiry check: Must be used quickly after opening.");
        super.checkExpiry();
    }
}
 