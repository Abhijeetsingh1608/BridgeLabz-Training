package com.smartCityTransportServiceManagementSystem;

import java.time.LocalTime;

class Passenger {
    String route;
    double fare;
    LocalTime time;

    Passenger(String route, double fare, LocalTime time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }
}