package com.smartCityTransportServiceManagementSystem;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 30, LocalTime.of(9, 0)),
                new MetroService("A-C", 50, LocalTime.of(8, 30)),
                new TaxiService("B-C", 120, LocalTime.of(7, 45))
        );

        System.out.println("---- Available Services (Low Fare First) ----");
        services.stream()
                .filter(s -> s.getFare() < 100)
                .sorted(Comparator.comparing(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n---- Live Dashboard ----");
        services.forEach(TransportService::printServiceDetails);

        FareCalculator taxiFare = distance -> distance * 15;
        double distance = TransportService.calculateDistance(18.5, 18.7);
        System.out.println("\nTaxi Fare for distance: " + taxiFare.calculateFare(distance));

        List<Passenger> passengers = Arrays.asList(
                new Passenger("A-B", 30, LocalTime.of(9, 0)),
                new Passenger("A-B", 30, LocalTime.of(10, 0)),
                new Passenger("A-C", 50, LocalTime.of(8, 30)),
                new Passenger("B-C", 120, LocalTime.of(18, 0))
        );

        Map<String, List<Passenger>> byRoute =
                passengers.stream()
                        .collect(Collectors.groupingBy(p -> p.route));

        System.out.println("\nPassengers Grouped By Route: " + byRoute.keySet());

        Map<Boolean, List<Passenger>> peakPartition =
                passengers.stream()
                        .collect(Collectors.partitioningBy(
                                p -> p.time.isAfter(LocalTime.of(8, 0)) &&
                                     p.time.isBefore(LocalTime.of(11, 0))
                        ));

        System.out.println("Peak Trips: " + peakPartition.get(true).size());

        DoubleSummaryStatistics revenueStats =
                passengers.stream()
                        .collect(Collectors.summarizingDouble(p -> p.fare));

        System.out.println("\nRevenue Summary:");
        System.out.println("Total: " + revenueStats.getSum());
        System.out.println("Average: " + revenueStats.getAverage());

        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getName() + " gets priority 🚑"));
    }
}