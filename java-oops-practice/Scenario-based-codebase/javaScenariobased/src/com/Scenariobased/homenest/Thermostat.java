package com.Scenariobased.homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId, 2.5);
    }

    @Override
    public void reset() {
        System.out.println("Thermostat temperature reset to 24°C");
    }
}