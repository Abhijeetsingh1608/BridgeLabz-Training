import java.util.Scanner;
//Create a class GreatestFactor to find the greatest factor
// of a number
public class GreatestFactor {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check for positive integer
        if (number <= 1) {
           System.out.println("Please enter an integer greater than 1.");
        } else {
        int greatestFactor = 1;
        // Loop from number-1 down to 1 
         for (int i = number - 1; i >= 1; i--) {
           if (number % i == 0) {
             greatestFactor = i;
              break;   // exit loop after finding greatest factor
                }
            }

            // Display result
            System.out.println("Greatest factor of " + number + " (besides itself) is " + greatestFactor);
        }
        sc.close();
    }
}
