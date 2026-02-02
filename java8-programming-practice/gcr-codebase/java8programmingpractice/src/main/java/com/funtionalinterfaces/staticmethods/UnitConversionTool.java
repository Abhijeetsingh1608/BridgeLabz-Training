package com.funtionalinterfaces.staticmethods;

public class UnitConversionTool {
		interface UnitConverter {
		static double kmToMiles(double km) {
			return km * 0.621371;
		}

		static double milesToKm(double miles) {
			return miles / 0.621371;
		}

		static double kgToLbs(double kg) {
			return kg * 2.20462;
		}

		static double lbsToKg(double lbs) {
			return lbs / 2.20462;
		}
	}

	public static void main(String[] args) {
		double km = 10.0;
		double miles = 6.21371;
		double kg = 5.0;
		double lbs = 11.0231;

		System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
		System.out.println(miles + " miles = " + UnitConverter.milesToKm(miles) + " km");
		System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");
		System.out.println(lbs + " lbs = " + UnitConverter.lbsToKg(lbs) + " kg");
	}

}
