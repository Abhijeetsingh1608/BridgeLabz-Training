import java.util.Scanner;
//Create a class Numbercheck to Check whether a number
// is positive, negative, or zero
public class NumberCheck{
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
         // Check the number
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        sc.close();
    }
}
