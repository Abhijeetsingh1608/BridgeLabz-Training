import java.util.Scanner;
//Create class StoreValuesAndSum to store the values upto 10
//and sum of all the numbers
public class StoreValuesAndSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Define an array of 10 double elements
        double[] numbers = new double[10];
        // Variable to store total sum
        double total = 0.0;
        // Index variable for the array
        int index = 0;
        // Infinite while loop to take user input
        while (true) {
            // Check if array size limit is reached
            if (index == 10) {
                break;
            }
            // Take input from the user
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();
            // Break loop if input is 0 or negative
            if (input <= 0) {
                break;
            }
            // Store valid input in the array and increment index
            numbers[index] = input;
            index++;
        }
        // Loop to calculate the total of all stored numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all stored numbers
        System.out.println("\nStored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum
        System.out.println("\nTotal of all numbers: " + total);

        sc.close();
    }
}
