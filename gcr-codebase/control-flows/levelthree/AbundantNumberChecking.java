import java.util.Scanner;
//Create a class AbundantNumberCheck to Check whether the number is
//Abundant or not
public class AbundantNumberCheck {
    public static void main(String[] args) {
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //Initialize sum to store sum of divisors
        int sum = 0; 
        //Loop through all numbers from 1 to number-1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i;           // Add divisor to sum
            }
        }
        //Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
        sc.close();
    }
}
