package com.Scenariobased.homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 0.2);
    }

    @Override
    public void reset() {
        System.out.println("Lock security keys reset");
    }
}