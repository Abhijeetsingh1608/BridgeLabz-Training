import java.util.*;
//Utility class NumberChecker
public class NumberChecker {
    // Methods
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
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
    // Duck number contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        int original = 0;
        for (int d : digits) {
            original = original * 10 + d;
        }

        return sum == original;
    }
	
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest digit = " + largest);
        System.out.println("Second Largest digit = " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Second Smallest digit = " + secondSmallest);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int count = countDigits(number);
        System.out.println("Number of digits = " + count);

        // Store digits
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array:");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

    
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(digits));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
		
        sc.close();
    }
}
