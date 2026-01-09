package com.Scenariobased.MediStore;

import java.time.LocalDate;

class Tablet extends Medicine{
	public Tablet(String name,double price, LocalDate expiryDate) {
		super(name,price,expiryDate);
	}
    
	@Override
	public void checkExpiry() {
		 System.out.println("Tablet expiry check: Standard expiry rules applied.");
	        super.checkExpiry();
	}
}
