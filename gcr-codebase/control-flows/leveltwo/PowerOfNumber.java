import java.util.Scanner;
//Create a class PowerOfNumber to find the power of number
public class PowerOfNumber {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take inputs
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();
        // Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for base and non-negative integer for power.");
        } else {
        int result = 1;
        // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Print result
            System.out.println(number + " raised to the power " + power + " is " + result);
        }

        sc.close();
    }
}
