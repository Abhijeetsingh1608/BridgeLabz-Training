// Create a class CourseFeeDiscountInput to calculate discount amount and final fee using user input
import java.util.Scanner;
public class CourseFeeDiscountInput {
    public static void main(String[] args) {

        // Declare variables fee,discountPercent
        double fee;
        double discountPercent;
        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);
        // Take user input for course fee
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();
        // Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;
        // Calculate final discounted fee
        double finalFee = fee - discount;

        // Display the result
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        // Close Scanner
        input.close();
    }
}
