import java.util.*;
public class MovieTicketBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueBooking = true;

        while (continueBooking) {

            int totalPrice = 0;
            System.out.println("\n--- Movie Menu ---");
            System.out.println("1. Action Movie");
            System.out.println("2. Comedy Movie");
            System.out.println("3. Drama Movie");
            System.out.print("Choose movie type: ");
            int movieChoice = scanner.nextInt();

            switch (movieChoice) {
                case 1:
                    totalPrice += 200;
                    break;
                case 2:
                    totalPrice += 150;
                    break;
                case 3:
                    totalPrice += 180;
                    break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }
            System.out.print("Choose seat type (Gold/Silver): ");
            String seatType = scanner.next();
            if (seatType.equalsIgnoreCase("Gold")) {
                totalPrice += 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                totalPrice += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = scanner.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                totalPrice += 80;
            }

            System.out.println("\n Booking Summary");
            System.out.println("Movie Type: " + movieChoice);
            System.out.println("Seat Type: " + seatType);
            System.out.println("Snacks Included: " + snacksChoice);
            System.out.println("Total Price: ₹" + totalPrice);

            // Continue booking?
            System.out.print("\nBook for another customer? (yes/no): ");
            continueBooking = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for using Movie Ticket Booking App!");
    }
}
