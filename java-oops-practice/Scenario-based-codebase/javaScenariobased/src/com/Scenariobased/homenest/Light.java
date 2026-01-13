package com.Scenariobased.homenest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void reset() {
        System.out.println("Light brightness reset to default");
    }
}