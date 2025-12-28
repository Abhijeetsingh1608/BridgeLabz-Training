package com.constructor.levelone;

public class CarRentalMain {
	 public static void main(String[] args) {
	        CarRental r1 = new CarRental();  
	        CarRental r2 = new CarRental("Amit", "SUV", 3); 

	        r1.display();
	        r2.display();
	    }
}
