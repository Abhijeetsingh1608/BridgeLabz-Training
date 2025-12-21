import java.util.*;
//Create a class UnitConverter to perform conversion
public class UnitConverter {
    //Declaring Method 
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double kmtomiles = 0.621371;
        double miles = km * kmtomiles;
        return miles;
    }
	public static double milesToKilo(int miles){	
		return 1.60334*miles;
	}
	public static double metersToFeet(int meters){
		return 3.28084 * meters;
	}
    public static void main(String[] args) {
	
        //Creating a Scanner object
        Scanner sc = new Scanner(System.in);
		// taking input
		System.out.print("Enter km : ");
		int km = sc.nextInt();
		System.out.print("Enter miles : ");
		int miles = sc.nextInt();
		System.out.print("Enter meters : ");
		int meters = sc.nextInt();
		
		// calling object
		double result1 = UnitConverter.convertKmToMiles(km);
		double result2 = UnitConverter.milesToKilo(miles);
		double result3 = UnitConverter.metersToFeet(meters);
		
		//Display result
		System.out.print(result1 + " " + result2 + " " + result3);
		
        sc.close();
    }
}