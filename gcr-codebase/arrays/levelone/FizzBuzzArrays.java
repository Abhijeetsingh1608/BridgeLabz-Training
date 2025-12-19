import java.util.Scanner;
//Create a class FizzBuzzArray to implement FizzBuzz using the array 
public class FizzBuzzArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take number input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            sc.close();
            return; // Exit the program
        }
        // Create a String array to store FizzBuzz results
        String[] results = new String[number + 1];
        // Loop from 0 to the number and store values in the array
        for (int i = 0; i <= number; i++) {
            // Check for multiples of both 3 and 5
            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
            // Check for multiples of 3
            else if (i != 0 && i % 3 == 0) {
                results[i] = "Fizz";
            }
            // Check for multiples of 5
            else if (i != 0 && i % 5 == 0) {
                results[i] = "Buzz";
            }
            // Store the number itself
            else {
                results[i] = String.valueOf(i);
            }
        }
		
        // Loop again to display the array results with position
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
