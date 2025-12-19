import java.util.Scanner;
//Create a class FactorsUsingWhile to find the factors of a number
public class FactorsUsingWhile {
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
         int counter = 1;
		 
        // While loop to find factors
         while (counter < number) {
             if (number % counter == 0) {
                 System.out.println(counter);
                }
                counter++; // increment counter
            }
        }
        sc.close();
    }
}
