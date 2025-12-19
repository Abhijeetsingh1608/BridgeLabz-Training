import java.util.Scanner;
//Create a class OddEvenArrays to save odd and even numbers
//and print odd and even numbers array
public class OddEvenArrays {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Get integer input from the user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0");
            sc.close();
            return; 
        }
        // Create arrays for odd and even numbers
        // Size = number / 2 + 1
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            }
            // Otherwise, the number is odd
            else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers array
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        // Print even numbers array
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
