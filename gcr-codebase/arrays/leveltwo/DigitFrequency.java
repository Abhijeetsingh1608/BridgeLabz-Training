import java.util.Scanner;
//Create a class DigitFrequency to find the frequency of each digit in
//a number using array
public class DigitFrequency {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Handle negative numbers
        number = Math.abs(number);
        // Store original number to find digit count
        int temp = number;
        // Count the number of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        // Array to store digits of the number
        int[] digits = new int[count];
        // Extract digits and store in array
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            index++;
            temp = temp / 10;
        }
        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];
        // Loop through digits array and update frequency
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
