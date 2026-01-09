package com.Scenariobased.tourmate;

public class Hotel {

    private String name;
    private double costPerDay;
    private int days;

    public Hotel(String name, double costPerDay, int days) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.days = days;
    }

    public double getTotalCost() {
        return costPerDay * days;
    }

    public String getName() {
        return name;
    }
}
