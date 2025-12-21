import java.util.Scanner;
// Create a class ChocolatesDistribution to calculate the distribution
public class ChocolatesDistribution {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        // Store result in array
        int[] result = new int[2];
        result[0] = quotient;   // chocolates per child
        result[1] = remainder;  // remaining chocolates
        return result;
    }
    // Main method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();
        // Validate input
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero.");
        } else {
            // Call method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display result
            System.out.println("Each child will get " + result[0] + " chocolates");
            System.out.println("Remaining chocolates = " + result[1]);
        }
        sc.close();
    }
}
