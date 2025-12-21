import java.util.*;
public class UnitConverterI {
    //Declaring Method 
    public static double ferhenheittocelcius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }
	public static double celciustofarhenheit(int celcius){
		return (celcius * 9 / 5) + 32;
	}
	public static double poundstokilo(int pounds){
		return pounds * 0.453592;
	}
	public static double kilogramtopounds(int kilogram){
		return  2.20462 * kilogram;
	}
	public static double gallonstoliters(int gallons){	
		return  3.78541 * gallons;
	}
	public static double literstogallons(int liter){	
		return  0.264172 * liter;
	}
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
		// taking input
		System.out.print("Enter farhenheit : ");
		int farhenheit = input.nextInt();
		System.out.print("Enter celsius : ");
		int celsius = input.nextInt();
		System.out.print("Enter pounds : ");
		int pounds = input.nextInt();
		System.out.print("Enter kilogram : ");
		int kilogram = input.nextInt();
		System.out.print("Enter gallons : ");
		int gallons = input.nextInt();
		System.out.print("Enter liter : ");
		int liter = input.nextInt();
		
		// calling object
		double result1 = UnitConverterI.ferhenheittocelcis(farhenheit);
		double result2 = UnitConverterI.celciustofarhenheit(celcius);
		double result3 = UnitConverterI.poundstokilo(pounds);
		double result4 = UnitConverterI.kilogramtopounds(kilogram);
		double result5 = UnitConverterI.gallonstoliters(gallons);
		double result6 = UnitConverterI.literstogallons(liter);
		
		//Display result
		System.out.print(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5 + " " + result6);
		
        sc.close();
    }
}