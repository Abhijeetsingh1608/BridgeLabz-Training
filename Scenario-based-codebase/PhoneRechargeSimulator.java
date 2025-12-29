import java.util.*;
public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        char choice;

        do {
            System.out.println("\nSelect Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.print("Enter your choice: ");
            int operator = sc.nextInt();
            System.out.print("Enter recharge amount: ₹");
            double amount = sc.nextDouble();
            balance += amount;

            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: 1.5GB/day for 28 days");
                    break;
                case 2:
                    System.out.println(" Airtel Offer: Unlimited calls + 2GB/day");
                    break;
                case 3:
                  System.out.println(" Vi Offer: Weekend data rollover");
                    break;
                default:
                    System.out.println("Invalid operator selected");
            }

            System.out.println("Recharge successful!");
            System.out.println("Current Balance: ₹" + balance);
            System.out.print("\nDo you want to recharge again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
        System.out.println("\nThank you for using Phone Recharge Simulator 📱");
        sc.close();
    }
}
