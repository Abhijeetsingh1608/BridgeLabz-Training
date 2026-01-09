package com.Scenariobased.tourmate;

public class Transport {

    // Encapsulation: hidden cost
    private double cost;
    private String mode;

    public Transport(String mode, double cost) {
        this.mode = mode;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getMode() {
        return mode;
    }
}
