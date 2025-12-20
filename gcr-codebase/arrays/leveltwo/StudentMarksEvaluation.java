import java.util.Scanner;
//Create a class StudentMarksEvaluation to evaluate students marks
public class StudentMarksEvaluation  {
    public static void main(String[] args) {
	
        //Create a scanner object
        Scanner sc = new Scanner(System.in);
        // Taking number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        // Creating arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        // Taking marks as input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }
            // Calculating percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            // Assigning grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // Displaying student details
        System.out.println("\n----- Student Results -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
