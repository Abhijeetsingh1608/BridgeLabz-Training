import java.util.Scanner;
//Create a class MultiplicationTable to print a multiplication 
//table of a number
public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);
        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Define an integer array to store multiplication results from 1 to 10
        int[] table = new int[10];
        // Loop from 1 to 10 and store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display multiplication table using the array
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
