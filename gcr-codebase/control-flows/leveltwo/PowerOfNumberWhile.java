import java.util.Scanner;
//Create a class PowerOfNumberWhile to find the power of a number
public class PowerOfNumberWhile {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();
        // Check for valid input
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive base and a non-negative power.");
        } else {
        int result = 1;      // stores the power result
        int counter = 0;     // counter for iterations
        // Calculate power using while loop
            while (counter < power) {
                result = result * number;
                counter++;
            }

        // Print result
            System.out.println(number + " raised to the power " + power + " is " + result);
        }
        sc.close();
    }
}
