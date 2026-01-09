package com.Scenariobased.tourmate;

public class TourMateMain{

    public static void main(String[] args) {

        Transport flight = new Transport("Flight", 30000);
        Hotel hotel = new Hotel("Grand Palace", 5000, 5);
        Activity safari = new Activity("City Tour", 8000);

        Trip domestic = new DomesticTrip(
                "Goa",
                5,
                flight,
                hotel,
                safari
        );

        Trip international = new InternationalTrip(
                "Paris",
                7,
                flight,
                hotel,
                safari
        );

        // Polymorphism
        domestic.book();
        System.out.println("Total Budget: ₹" + domestic.getBudget());

        System.out.println();

        international.book();
        System.out.println("Total Budget: ₹" + international.getBudget());
    }
}
