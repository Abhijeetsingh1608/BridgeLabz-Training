import java.util.Scanner;
//Create a class CalculatorSwitchCase to perform arithmetic operations
public class CalculatorSwitchCase {
    public static void main(String[] args) { 
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Get input numbers and operator from user
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next(); // Operator as a String
        double result;   // To store the result of calculation
		
        //Perform operation based on operator using switchcase
        switch (op) {
            case "+": // Addition
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-": // Subtraction
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*": // Multiplication
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/": // Division
                if (second != 0) { // Check to avoid division by zero
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default: // Invalid operator
                System.out.println("Invalid Operator. Please use +, -, *, or /.");
                break;
        }
        sc.close();
    }
}
