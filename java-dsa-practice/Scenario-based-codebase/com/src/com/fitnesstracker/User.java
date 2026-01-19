package com.fitnesstracker;

public class User {

    private int id;
    private String name;
    private int steps;

    public User(int id, String name, int steps) {
        this.id = id;
        this.name = name;
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return id + " " + name + " Steps: " + steps;
    }
}
