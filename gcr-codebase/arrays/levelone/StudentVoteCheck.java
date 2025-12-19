import java.util.Scanner;
//Create a class StudentVoteCheck to check whether a student
//can vote or not
public class StudentVoteCheck {
    public static void main(String[] args) {

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        // Define an array to store ages of 10 students
        int[] ages = new int[10];
        // Take input for each student's age
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        // Loop through the array and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            // Check if age is negative
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            }
            // Check if student can vote
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            }
            // Student cannot vote
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }
        sc.close();
    }
}
