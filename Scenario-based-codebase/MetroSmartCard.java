import java.util.*;
//Create a class MetroSmartCard
public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100.0; // Initial smart card balance
        char choice;
        do {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance traveled (in km): ");
            int distance = sc.nextInt();
            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted.");
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nFinal Balance: ₹" + balance);
        sc.close();
    }
}
