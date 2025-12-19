import java.util.Scanner;
//Create a class ArmstrongNumberCheck to check the number is armstrong or not
public class ArmstrongNumberCheck {
    public static void main(String[] args) {\
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //  Initialize sum variable to 0
		int sum = 0; 
        //Store original number to compare later
		 int originalNumber = numbe
        //Use a while loop to process each digit
        while (originalNumber != 0) {
           int digit = originalNumber % 10; // Get last digit
           sum += digit * digit * digit;    // Add cube of digit to sum
           originalNumber = originalNumber / 10; // Remove last digit
        }
		
        //Check if sum of cubes is equal to the original number
		//Display the result
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
        sc.close();
    }
}
