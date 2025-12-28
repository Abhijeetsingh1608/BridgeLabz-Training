package com.constructor.levelone;

public class HotelBookingMain {
	public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();                      // default
        HotelBooking b2 = new HotelBooking("Rahul", "Deluxe", 3);  // parameterized
        HotelBooking b3 = new HotelBooking(b2);                   // copy

        b1.display();
        b2.display();
        b3.display();
    }

}
