package com.constructor.levelone;

public class Vehicle {
	
	 String ownerName;
	    String vehicleType;
	    static double registrationFee = 5000;
	    
	    Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    void displayVehicleDetails() {
	        System.out.println(
	            "Owner Name: " + ownerName +
	            ", Vehicle Type: " + vehicleType +
	            ", Registration Fee: ₹" + registrationFee
	        );
	    }

	    static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

}
