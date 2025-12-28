package com.constructor.levelone;

public class HotelBooking {
	 String guestName;
	    String roomType;
	    int nights;

	    // Default constructor
	    HotelBooking() {
	        guestName = "Guest";
	        roomType = "Standard";
	        nights = 1;
	    }

	    // Parameterized constructor
	    HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    // Copy constructor
	    HotelBooking(HotelBooking hb) {
	        this.guestName = hb.guestName;
	        this.roomType = hb.roomType;
	        this.nights = hb.nights;
	    }

	    void display() {
	        System.out.println(
	            "Guest: " + guestName +
	            ", Room Type: " + roomType +
	            ", Nights: " + nights
	        );
	    }

}
