import java.util.Scanner;
//Create a class CountDigits to count the number of digits 
public class CountDigits {
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        //Initialize count to 0
		int count = 0; 
        // Store original number in temp variable
        int temp = number; 
        //Loop until temp becomes 0
        if (temp == 0) {
            count = 1; // Special case: 0 has 1 digit
        } else {
            while (temp != 0) {
              temp = temp / 10; // Remove last digit
              count++;           // Increase count by 1
            }
        }
		
        //Display the number of digits
        System.out.println("Number of digits in " + number + " is: " + count);
        sc.close();
    }
}
