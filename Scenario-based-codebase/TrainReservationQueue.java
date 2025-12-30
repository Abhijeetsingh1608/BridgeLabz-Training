import java.util.*;
public class TrainReservationQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeats = 5;   // Available seats
        int choice;
        while (true) {
            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (totalSeats > 0) {
                        totalSeats--;
                        System.out.println("Ticket booked successfully!");
                        System.out.println("Remaining seats: " + totalSeats);
                        if (totalSeats == 0) {
                            System.out.println("All seats are booked!");
                            break; // stop booking when seats are zero
                        }
                    } else {
                        System.out.println("No seats available!");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Available seats: " + totalSeats);
                    break;

                case 3:
                    System.out.println("Thank you for using Train Reservation System.");
                    return; // exit program

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            if (totalSeats == 0) {
                break; // break while-loop when seats are full
            }
        }
    }
}
