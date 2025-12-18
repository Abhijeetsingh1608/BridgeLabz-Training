// Create a class CourseFeeDiscount to calculate discount amount and final fee to be paid
public class CourseFeeDiscount {
    public static void main(String[] args) {
	
        // Create a variable as fee
        double fee = 125000;
        // Create a variable discountpercentage
        double discountPercent = 10;
        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;
        // Calculate final discounted fee
        double finalFee = fee - discount;

        // Display the result
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
