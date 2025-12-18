//Create a class DistanceConverter to find the distance in yards and miles 
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);
        // Read distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the converted distances
        System.out.println(
            "The distance in yards is " + distanceInYards +
            " and in miles is " + distanceInMiles);

        // Close the Scanner
        input.close();
    }
}
