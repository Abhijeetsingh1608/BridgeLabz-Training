package com.foodfest;

public class Stall {
    private String name;
    private int footfall;

    public Stall(String name, int footfall) {
        this.name = name;
        this.footfall = footfall;
    }

    public int getFootfall() {
        return footfall;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " -> " + footfall + " customers";
    }
}
