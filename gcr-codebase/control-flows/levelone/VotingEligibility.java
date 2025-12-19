import java.util.Scanner;
//Create a class VotingEligibility to Check who can vote or who cannot
public class VotingEligibility{
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter age: ");
        int age = sc.nextInt();
		
        // Check if the number is a natural number
        if (age >= 18) {
           System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
