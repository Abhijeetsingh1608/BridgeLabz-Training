package com.Scenariobased.homenest;

public class HomeNestMain {

    public static void main(String[] args) {

        Device light = new Light("L-101");
        Device camera = new Camera("C-201");
        Device thermostat = new Thermostat("T-301");
        Device lock = new Lock("K-401");

        light.turnOn();
        camera.turnOn();

        System.out.println("Light energy: " + light.calculateMonthlyEnergy(100));

        thermostat.reset();
        lock.reset();

        camera.turnOff();
    }
}