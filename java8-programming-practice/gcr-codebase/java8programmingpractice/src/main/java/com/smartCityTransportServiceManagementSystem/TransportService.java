package com.smartCityTransportServiceManagementSystem;


import java.time.LocalTime;

interface TransportService {

    String getName();
    String getRoute();
    double getFare();
    LocalTime getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getName() + " | Route: " + getRoute() + " | Fare: " + getFare() + " | Time: " + getDepartureTime());
    }

    static double calculateDistance(double lat1, double lat2) {
        return Math.abs(lat1 - lat2) * 111;
    }
}