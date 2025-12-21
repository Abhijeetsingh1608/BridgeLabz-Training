import java.util.*;
//Create a class NumberCheckerIII to check the number
public class NumberCheckerIII {
    // Methods
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Neon number: sum of digits of square == number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Spy number: sum of digits == product of digits
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Automorphic number: square ends with the number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // Buzz number: divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }
    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is Prime Number? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeonNumber(number));
        System.out.println("Is Spy Number? " + isSpyNumber(number));
        System.out.println("Is Automorphic Number? " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number? " + isBuzzNumber(number));

        sc.close();
    }
}
