import java.util.Scanner;
//Create a class FactorsOfNumber to find the factors of a number,
//store them and display
public class FactorsOfNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Initial maximum size for factors array
        int maxFactor = 10;
        // Create factors array with initial size
        int[] factors = new int[maxFactor];
        // Index variable to track current position in the array
        int index = 0;
        // Loop from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                // If array is full, resize it
                if (index == maxFactor) {
                    // Double the size
                    maxFactor = maxFactor * 2;
                    // Create a temporary array with new size
                    int[] temp = new int[maxFactor];
                    // Copy existing elements to temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    // Assign temp array back to factors
                    factors = temp;
                }
                // Store the factor and increment index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
