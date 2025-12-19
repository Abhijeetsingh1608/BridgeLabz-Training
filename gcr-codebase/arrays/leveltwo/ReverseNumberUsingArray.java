import java.util.Scanner;
//Create a class ReverseNumberUsingArray to reverse the number and 
//store in array
public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Store the original number for digit count
        int tempNumber = number;
        // Find the count of digits in the number
        int count = 0;
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }
        // Create an array to store digits
        int[] digits = new int[count];
        // Extract digits and store in array
        tempNumber = number;
        int index = 0;
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            index++;
            tempNumber = tempNumber / 10;
        }
        // Create an array to store reversed digits
        int[] reverseDigits = new int[count];
        // Store elements in reverse order
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed number using array
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}
