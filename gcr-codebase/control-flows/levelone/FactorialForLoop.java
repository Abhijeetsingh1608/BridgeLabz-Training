import java.util.Scanner;
//Create a class FactorialForLoop to find the factorial of an integer
public class FactorialForLoop {
    public static void main(String[] args) {
        
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check if number is a natural number
        if (number < 0) {
            System.out.println("Please enter a valid natural number");
        } else {
        long factorial = 1;   // to store factorial
        // Calculate factorial using for loop
          for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            }

            // Print result
            System.out.println("Factorial of " + number + " is " + factorial);
        }
        sc.close();
    }
}
