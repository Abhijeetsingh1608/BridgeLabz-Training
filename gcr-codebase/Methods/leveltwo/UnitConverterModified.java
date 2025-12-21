import java.util.*;
//Create a class UnitConverterModified to perform unit conversion
public class UnitConverterModified {

    //Creating Method 
    public static double convertingYardsToFeet(double yard) {
        return 3 * yard;
    }
	public static double feetToyard(int feet){
		
		return 0.333333 * feet;
	}
	public static double metersToinch(int meters){
		
		return 39.3701 * meters;
	
	public static double inchesTometer(int inch){
		
		return 2.54 * inch;
	}
//  Calling main
    public static void main(String[] args) {
	    //Create Scanner object
        Scanner input = new Scanner(System.in);
		// taking input
		System.out.print("Enter yard : ");
		int yard = input.nextInt();
		System.out.print("Enter feet : ");
		int feet = input.nextInt();
		System.out.print("Enter meters : ");
		int meters = input.nextInt();
		System.out.print("Enter inch : ");
		int inch = input.nextInt();
		
		// calling object
		double result1 = UnitConverterUpdated.convertingYardsToFeet(km);
		double result2 = UnitConverterUpdated.feetToyard(miles);
		double result3 = UnitConverterUpdated.metersToinch(meters);
		double result4 = UnitConverterUpdated.inchesTometer(inch);
		
		// result
		System.out.print(result1 + " " + result2 + " " + result3 + " " + result4);
		

        sc.close();
    }
}