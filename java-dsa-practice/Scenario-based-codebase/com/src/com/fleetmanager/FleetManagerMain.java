package com.fleetmanager;

public class FleetManagerMain {
	 public static void main(String[] args) {

	        Vehicle[] depotVehicles = {
	            new Vehicle("V101", 12000),
	            new Vehicle("V102", 8000),
	            new Vehicle("V103", 15000),
	            new Vehicle("V104", 10000)
	        };

	        FleetManager manager = new FleetManager();

	        // Sort vehicles by mileage
	        Vehicle[] sortedSchedule = manager.mergeSort(depotVehicles);

	        manager.displaySchedule(sortedSchedule);
	    }

}
