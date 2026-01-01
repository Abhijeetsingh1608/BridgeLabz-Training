import java.util.*;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n====== Currency Exchange Kiosk ======");
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("\nSelect target currency:");
            System.out.println("1. USD (US Dollar)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. GBP (British Pound)");
            System.out.println("4. JPY (Japanese Yen)");

            System.out.print("Enter your choice (1-4): ");
            int option = sc.nextInt();

            double convertedAmount = 0;

            switch (option) {
                case 1:
                    convertedAmount = inr * 0.012;   // USD
                    System.out.println("Converted Amount: $" + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inr * 0.011;   // EUR
                    System.out.println("Converted Amount: €" + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inr * 0.010;   // GBP
                    System.out.println("Converted Amount: £" + convertedAmount);
                    break;

                case 4:
                    convertedAmount = inr * 1.80;    // JPY
                    System.out.println("Converted Amount: ¥" + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency choice!");
            }

            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        System.out.println("\nThank you for using Currency Exchange Kiosk 💱");
        sc.close();
    }
}
