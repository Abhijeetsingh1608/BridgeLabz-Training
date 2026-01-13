package com.Scenariobased.homenest;


public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;              // encapsulated
    protected double energyUsage;

    // protected → firmware logs secured inside package / subclasses
    protected String firmwareLog = "v1.0";

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    // Status can be read, not modified directly
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateMonthlyEnergy(int hours) {
        return energyUsage * hours;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }
}