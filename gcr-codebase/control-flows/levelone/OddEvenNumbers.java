import java.util.Scanner;
//Create a class OddEvenNumbers to check number is odd or even
public class OddEvenNumbers {
    public static void main(String[] args) {
		
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
        // Loop from 1 to number
         for (int i = 1; i <= number; i++) { 
		 
		 //Display result
         if (i % 2 == 0) {
          System.out.println(i + " is an even number");
         } else {
          System.out.println(i + " is an odd number");
                }
            }
        }

        sc.close();
    }
}
