import java.util.Scanner;
//Create a class MultiplicationTableRange to find the multiplication table of
//a number entered by user from 6 to 9
public class MultiplicationTableRange {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Define an integer array to store multiplication results (6 to 9 → 4 values)
        int[] multiplicationResult = new int[4];
        // Using a for loop to calculate multiplication from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display the multiplication table from the array
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
