package com.funtionalinterfaces.implementinginterfaces;
public class SmartDeviceControl {
		interface SmartDevice {
		void turnOn();
		void turnOff();
	}

	static class SmartLight implements SmartDevice {
		public void turnOn() {
			System.out.println("Smart Light is turned ON.");
		}

		public void turnOff() {
			System.out.println("Smart Light is turned OFF.");
		}
	}

	static class SmartAC implements SmartDevice {
		public void turnOn() {
			System.out.println("Smart AC is turned ON.");
		}

		public void turnOff() {
			System.out.println("Smart AC is turned OFF.");
		}
	}

	static class SmartTV implements SmartDevice {
		public void turnOn() {
			System.out.println("Smart TV is turned ON.");
		}

		public void turnOff() {
			System.out.println("Smart TV is turned OFF.");
		}
	}

	public static void main(String[] args) {
		SmartDevice light = new SmartLight();
		SmartDevice ac = new SmartAC();
		SmartDevice tv = new SmartTV();

		light.turnOn();
		light.turnOff();

		ac.turnOn();
		ac.turnOff();

		tv.turnOn();
		tv.turnOff();
	}

}
