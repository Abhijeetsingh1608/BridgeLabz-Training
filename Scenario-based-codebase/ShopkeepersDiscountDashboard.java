import java.util.*;
public class ShopkeepersDiscountDashboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double DISCOUNT_10 = 0.10;  
        final double DISCOUNT_20 = 0.20;   
        double totalBill = 0.0;
        double discount = 0.0;

        System.out.print("Enter number of items: ");
        int items = sc.nextInt();
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 2000) {
            discount = totalBill * DISCOUNT_10;
        } else {
            discount = 0;
        }

        // Display bill details
        System.out.println("\n Bill Summary ");
        System.out.println("Total Bill Amount : ₹" + totalBill);
        System.out.println("Discount Applied  : ₹" + discount);
        System.out.println("Final Amount      : ₹" + (totalBill - discount));

        sc.close();
    }
}
