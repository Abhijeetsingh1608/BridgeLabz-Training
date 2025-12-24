// Program: Date Arithmetic with LocalDate
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;
//Create a class ArithmeticsDate
public class ArithmeticsDate {
    // Method to perform date arithmetic
    public static LocalDate processDate(LocalDate inputDate) {
        LocalDate result = inputDate.plusDays(7);
        result = result.plusMonths(1);
        result = result.plusYears(2);
        result = result.minusWeeks(3);

        return result;
    }
    //Calling main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
d        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = in.nextLine();
        // Parse input date
        LocalDate inputDate = LocalDate.parse(dateInput);
        // Perform arithmetic
        LocalDate finalDate = processDate(inputDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        // Display results
        System.out.println("Original Date: " + inputDate.format(formatter));
        System.out.println("Final Date after operations: " + finalDate.format(formatter));

        in.close();
    }
}