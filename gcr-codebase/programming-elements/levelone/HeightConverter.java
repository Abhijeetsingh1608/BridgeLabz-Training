// Create a class HeghtConverter to convert height from centimeters to feet and inches
import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {

        // Declare variable for height in centimeters
        double heightCm;
        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);
        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        // Convert centimeters to inches
        // As 1 inch = 2.54 cm
        double totalInches = heightCm / 2.54;
        // Convert inches to feet and remaining inches
        // As1 foot = 12 inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the result
        System.out.println(
            "Your Height in cm is " + heightCm +
            " while in feet is " + feet +
            " and inches is " + inches);
        // Close Scanner
        input.close();
    }
}
