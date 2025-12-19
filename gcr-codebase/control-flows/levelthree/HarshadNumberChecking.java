import java.util.Scanner;
//Create a class HarshadNumberCheck to check whether the number is
//Harshad number or not
public class HarshadNumberCheck {
    public static void main(String[] args) {
		
		//Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        //Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;          //Initialize sum of digits
        int temp = number;    // Store original number to extract digits
        //Loop to sum all digits of the number
        while (temp != 0) {
            int digit = temp % 10; // Get last digit
            sum += digit;          // Add digit to sum
            temp = temp / 10;      // Remove last digit
        }
        //Check if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
        sc.close();
    }
}

