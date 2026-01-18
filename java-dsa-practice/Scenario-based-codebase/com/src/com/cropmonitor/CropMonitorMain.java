package com.cropmonitor;

public class CropMonitorMain {

    public static void main(String[] args) {

        SensorData[] data = {
            new SensorData(50, 24.5),
            new SensorData(20, 22.1),
            new SensorData(80, 26.0),
            new SensorData(30, 23.0),
            new SensorData(70, 25.2)
        };

        CropMonitor monitor = new CropMonitor();

        monitor.quickSort(data, 0, data.length - 1);
        monitor.displayData(data);
    }
}