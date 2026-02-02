package com.funtionalinterfaces.defaultmethods;

public class SmartVehicleDashboard {
	interface Vehicle {
		void displaySpeed();

		default void displayBatteryPercentage() {
			System.out.println("Battery percentage feature not available for this vehicle.");
		}
	}

	static class Car implements Vehicle {
		public void displaySpeed() {
			System.out.println("Car speed: 60 mph");
		}
	}

	static class ElectricCar implements Vehicle {
		public void displaySpeed() {
			System.out.println("Electric Car speed: 55 mph");
		}

		public void displayBatteryPercentage() {
			System.out.println("Electric Car battery percentage: 80%");
		}
	}

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle electricCar = new ElectricCar();

		car.displaySpeed();
		car.displayBatteryPercentage();

		electricCar.displaySpeed();
		electricCar.displayBatteryPercentage();
	}
}
