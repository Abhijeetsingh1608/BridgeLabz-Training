import java.util.*;
// Create a class FactorsOfNumber to find the factors of a number
public class FactorsOfNumber {
    // Method to find factors and return them as an array
    public static int[] findFactorsOfNumber(int number) {
        int count = 0;
        // First loop: find count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Initialize array with count
        int[] factors = new int[count];
        int index = 0;
        // Second loop: store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Find factors
        int[] factors = findFactorsOfNumber(number);

        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Calculate results
        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        // Display results
        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);

        sc.close();
    }
}
