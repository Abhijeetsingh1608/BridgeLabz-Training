import java.util.Scanner;
//Create a class Factorial to find the factorial of an integer
public class Factorial {
    public static void main(String[] args) {
        
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check if number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
        long factorial = 1;   // to store factorial
         int i = 1;
        // Compute factorial using while loop
            while (i <= number) {
            factorial = factorial * i;
                i++;
            }

            // Print result
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
