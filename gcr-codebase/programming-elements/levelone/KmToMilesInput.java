// Create a class KmToMilesInput to convert distance from kilometers to miles using user input
import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) { 
	
        // Create variable for kilometers
        double km;
        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);
        // Read kilometers from user
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();
        // Convert kilometers to miles
        // As Given: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Display the result
        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km" );
        // Close the Scanner
        input.close();
    }
}
