// Create a class TotalPriceCalculator and to calculate total purchase price of items
import java.util.Scanner;
public class TotalPriceCalculator {
    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);
        // Read unit price of the item
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();
        // Read quantity of items to be bought
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // Close the Scanner
        input.close();
    }
}
