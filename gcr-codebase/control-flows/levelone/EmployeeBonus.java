import java.util.Scanner;
//Create a class EmployeeBonus to find the bonus of employees
public class EmployeeBonus {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take inputs
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();
		
        // Check for bonus eligibility and Display result
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus. Service period is 5 years or less.");
        }
        sc.close();
    }
}
