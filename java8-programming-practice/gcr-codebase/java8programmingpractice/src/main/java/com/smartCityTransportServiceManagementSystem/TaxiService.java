package com.smartCityTransportServiceManagementSystem;

import java.time.LocalTime;

class TaxiService implements TransportService, EmergencyService {
    private String route;
    private double fare;
    private LocalTime time;

    TaxiService(String route, double fare, LocalTime time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    public String getName() { return "Taxi"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return time; }
}