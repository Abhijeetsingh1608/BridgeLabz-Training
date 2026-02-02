package com.streamapi.foreachmethod;

import java.util.Arrays;
import java.util.List;

public class IOTSensorReadings {

    // Functional Interface
    interface Sensor {
        double getReading();
    }

    // Temperature Sensor
    static class Temperature implements Sensor {
        private double reading;

        public Temperature(double reading) {
            this.reading = reading;
        }

        @Override
        public double getReading() {
            return reading;
        }
    }

    public static void main(String[] args) {

        List<Sensor> sensors = Arrays.asList(
                new Temperature(22.5),
                new Temperature(35.0),
                new Temperature(55.6),
                new Temperature(68.2),
                new Temperature(40.1)
        );

        double threshold = 50.0;

        // Print all readings above threshold
        sensors.stream()
               .map(Sensor::getReading)
               .filter(r -> r > threshold)
               .forEach(r -> System.out.println("High Reading: " + r));
    }
}

