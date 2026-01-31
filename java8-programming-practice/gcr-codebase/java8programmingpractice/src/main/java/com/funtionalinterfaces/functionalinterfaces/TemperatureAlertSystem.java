package com.funtionalinterfaces.functionalinterfaces;

public class TemperatureAlertSystem {
		interface TemperatureAlert {
		boolean isTemperatureHigh(Double temperature);
	}

	static class TemperatureMonitor implements TemperatureAlert {
		private static final double THRESHOLD = 37.5;

		@Override
		public boolean isTemperatureHigh(Double temperature) {
			return temperature > THRESHOLD;
		}
	}

	public static void main(String[] args) {
		TemperatureAlert alertSystem = new TemperatureMonitor();

		Double[] temperatures = {36.5, 38.2, 37.0, 39.1, 36.8};

		System.out.println("Temperature Alerts:");
		for (Double temp : temperatures) {
			if (alertSystem.isTemperatureHigh(temp)) {
				System.out.println("Alert! High temperature detected: " + temp + "°C");
			} else {
				System.out.println("Temperature is normal: " + temp + "°C");
			}
		}
	}

}
