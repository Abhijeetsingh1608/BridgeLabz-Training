import java.util.Scanner;
//Create a class LargestAndSecondLargestDigitModified to store the largest and second largest
//largest digit and array is modified
public class LargestAndSecondLargestDigitModified {
    public static void main(String[] args) {

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        // Take number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Initial maximum size for digits array
        int maxDigit = 10;
        // Array to store digits of the number
        int[] digits = new int[maxDigit];
        // Index variable to track array position
        int index = 0;
        // Loop to extract digits until number becomes 0
        while (number != 0) {
        // If array is full, increase its size by 10
            if (index == maxDigit) {
            // Increase maxDigit by 10
              maxDigit = maxDigit + 10;
            // Create temporary array with new size
              int[] temp = new int[maxDigit];
            // Copy old digits into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                // Assign temp array back to digits
                digits = temp;
            }
            // Extract last digit
            digits[index] = number % 10;
            index++;
            // Remove last digit from number
            number = number / 10;
        }
        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        // Loop to find largest and second largest digits
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
