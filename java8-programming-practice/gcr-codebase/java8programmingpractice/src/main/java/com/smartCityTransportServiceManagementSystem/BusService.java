package com.smartCityTransportServiceManagementSystem;

import java.time.LocalTime;

class BusService implements TransportService {
    private String route;
    private double fare;
    private LocalTime time;

    BusService(String route, double fare, LocalTime time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    public String getName() { return "Bus"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return time; }
}