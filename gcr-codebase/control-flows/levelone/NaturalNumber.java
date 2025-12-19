import java.util.Scanner;
//Create a class NaturalNumberSum to check natural number and
//sum of natural numbers
public class NaturalNumberSum {
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        // Check if the number is a natural number
        if (number >= 1) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        sc.close();
    }
}
