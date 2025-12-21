import java.util.*;
//Create a class NumberCheckerIV to check the number
public class NumberCheckerIV{
    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    // Perfect number: sum of proper divisors == number
    public static boolean isPerfectNumber(int number) {
        return sumOfProperDivisors(number) == number;
    }
    // Abundant number: sum of proper divisors > number
    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }
    // Deficient number: sum of proper divisors < number
    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }
    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
    // Method to check Strong Number
    // Strong number: sum of factorial of digits == number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is Perfect Number? " + isPerfectNumber(number));
        System.out.println("Is Abundant Number? " + isAbundantNumber(number));
        System.out.println("Is Deficient Number? " + isDeficientNumber(number));
        System.out.println("Is Strong Number? " + isStrongNumber(number));

        sc.close();
    }
}
