import java.util.*;
public class LibraryReminderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int FINE_PER_DAY = 5;

        System.out.println(" Rohan’s Library Fine Calculator");
        for (int book = 1; book <= 5; book++) {
            System.out.println("\nBook " + book);
            System.out.print("Enter due date (day number): ");
            int dueDate = scanner.nextInt();
            System.out.print("Enter return date (day number): ");
            int returnDate = scanner.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fineAmount = lateDays * FINE_PER_DAY;
                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fineAmount);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        System.out.println("\nThank you for using Library Reminder App!");
    }
}
