package com.ambulanceroute;

public class AmbulanceRouteMain{
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayRoute();

        route.findAvailableUnit();     // Redirect patient

        route.removeUnit("Radiology"); // Maintenance

        route.displayRoute();

        route.findAvailableUnit();
    }
}
