import java.util.Scanner;
//Create a class FactorsOfNumber to find the factors of a number
public class FactorsOfNumber {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

        // Loop from 1 to number-1 and Display the result
        for (int i = 1; i < number; i++) {
           if (number % i == 0) {
               System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
