import java.util.Scanner;
//Create a class NumberCheckArray to check whether the number is 
//positive.negative or zero
public class NumberCheckArray {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);
        // Define an integer array of size 5
        int[] numbers = new int[5];
        // Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            // Check if number is positive
            if (numbers[i] > 0) {
                // Check if the positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }
            // Check if number is negative
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            // Number is zero
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare the first and last elements of the array
		// and prints the results
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        if (firstElement == lastElement) {
            System.out.println("First and last elements are equal");
        } else if (firstElement > lastElement) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
        sc.close();
    }
}
