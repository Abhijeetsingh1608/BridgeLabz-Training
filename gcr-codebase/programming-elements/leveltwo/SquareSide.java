// Create a class SquareSide to find the side of a square from its perimeter
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);
        // Read the perimeter of the square
        double perimeter = input.nextDouble();
        // Calculate the side of the square
        // Perimeter of square = 4 * side
        double side = perimeter / 4;

        // Display the result
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter);
			
        // Close the Scanner
        input.close();
    }
}
