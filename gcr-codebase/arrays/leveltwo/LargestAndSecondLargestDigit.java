import java.util.Scanner;
//Create a class LargestAndSecondLargestDigit to store the digits of no.
// and find largest or second largest element
public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Maximum digits allowed to store
        int maxDigit = 10;
        // Array to store digits of the number
        int[] digits = new int[maxDigit];
        // Index variable for the array
        int index = 0;
        // Loop to extract digits until number becomes 0
        while (number != 0) {
        // Break if array size limit is reached
            if (index == maxDigit) {
                break;
            }
         // Get the last digit
          int digit = number % 10;
          // Store the digit in the array
            digits[index] = digit;
            index++;
          // Remove the last digit from the number
            number = number / 10;
        }
        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        // Loop through the array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
