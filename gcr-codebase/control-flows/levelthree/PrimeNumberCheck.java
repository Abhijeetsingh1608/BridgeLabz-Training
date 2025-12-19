import java.util.Scanner;
//Creat a class PrimeNumberCheck to check the number is prime or not
public class PrimeNumberCheck {
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a Prime Number");
        } else {
            boolean isPrime = true; // Assume the number is prime initially
        // Check for divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
               if (number % i == 0) {
        // Number is divisible by some other number
               isPrime = false;
                 break; // Exit the loop early
                }
            }

            // Display result
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }
        }
        sc.close();
    }
}
