package com.constructor.levelone;

public class CarRental {
	
	String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; 
    double totalCost;

    CarRental() {
        customerName = "Customer";
        carModel = "Standard";
        rentalDays = 1;
        calculateTotalCost();
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    void calculateTotalCost() {
        totalCost = rentalDays * costPerDay;
    }

    void display() {
        System.out.println(
            "Customer: " + customerName +
            ", Car Model: " + carModel +
            ", Rental Days: " + rentalDays +
            ", Total Cost: ₹" + totalCost
        );
    }
}
