import java.util.Scanner;
//Create a class MultiplesBelow100While to find all the multiples
//of a number below 100
public class MultiplesBelow100While {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        // Check for valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 100;

        // While loop to find multiples
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;  // decrement counter
            }
        }
        sc.close();
    }
}
