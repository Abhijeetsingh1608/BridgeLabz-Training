package com.Scenariobased.homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 1.2);
    }

    @Override
    public void reset() {
        System.out.println("Camera angle & recording reset");
    }
}