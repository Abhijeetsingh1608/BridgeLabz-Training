import java.util.*;
//Create a class MaximumOfThree
public class MaximumOfThree {
    // Methods
    public static int getInput(Scanner in, String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    //Calling Main Method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Taking inputs
        int num1 = getInput(in, "Enter first number: ");
        int num2 = getInput(in, "Enter second number: ");
        int num3 = getInput(in, "Enter third number: ");
        // Calculating maximum
        int maximum = findMaximum(num1, num2, num3);

        // Display result
        System.out.println("The maximum of the three numbers is: " + maximum);

        in.close();
    }
}