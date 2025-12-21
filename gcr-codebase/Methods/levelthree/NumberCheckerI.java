import java.util.*;
// Create a class NumberCheckerI to check the number
public class NumberCheckerI {
    // Method
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
	
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        return digits;
    }
	
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // Main method
    public static void main(String[] args) {
        //Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        System.out.println("Count of digits = " + count);
        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits = " + sumDigits);
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits = " + sumSquares);
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "        " + frequency[i][1]);
            }
        }

        sc.close();
    }
}
