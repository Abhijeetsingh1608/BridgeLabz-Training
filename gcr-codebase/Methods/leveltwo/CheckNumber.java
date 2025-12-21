import java.util.*;

// Create a class CheckNumber to check the number
public class CheckNumber {

    // Method to check even or odd
    public static boolean isEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
            return true;
        } else {
            System.out.println(number + " is Odd");
            return false;
        }
    }

    // Method to check positive or negative
    public static boolean isPositiveNegative(int number) {
        if (number < 0) {
            System.out.println(number + " is Negative");
            return false;
        } else {
            System.out.println(number + " is Positive");
            return true;
        }
    }
    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        }
        return 0;
    }

    public static void main(String args[]) {
        int[] arr = {8, -3, 32, 45, 48};

        for (int i = 0; i < arr.length; i++) {
            // Check positive/negative
            boolean isPositive = CheckNumber.isPositiveNegative(arr[i]);

            // If positive, check even/odd
            if (isPositive) {
                CheckNumber.isEvenOdd(arr[i]);
            }
        }
    }
}
