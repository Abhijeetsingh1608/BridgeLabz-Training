import java.util.Scanner;
//Create a class to find quotient and remainder of two numbers
public class QuotientAndRemainder {
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Read two numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 +
            " and " + number2
        );

        input.close();
    }
}
