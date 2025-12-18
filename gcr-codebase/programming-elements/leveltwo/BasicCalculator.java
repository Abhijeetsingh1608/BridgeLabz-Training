// Create a class BasicCalculator to perform basic arithmetic operations
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        // Variables for user input
        double number1, number2;
        // Scanner for keyboard input
        Scanner input = new Scanner(System.in);
        // Read two numbers
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        // Arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers "
            + number1 + " and " + number2 + " is "
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        input.close();
    }
}
