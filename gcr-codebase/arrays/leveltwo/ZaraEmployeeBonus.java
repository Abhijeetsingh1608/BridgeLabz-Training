import java.util.Scanner;
//Create a class ZaraEmployeeBonus to find the bonus of employees
//based on their years of service
public class ZaraEmployeeBonus {
    public static void main(String[] args) {
	
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        // Loop to take user input with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();
            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid salary and years of service.");
                i--; // Decrement index to repeat input for same employee
                continue;
            }
            // Add to total old salary
            totalOldSalary += salary[i];
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            // Check bonus eligibility
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];
            // Calculate totals
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Print final results
        System.out.println("\n----- Zara Company Bonus Summary -----");
        System.out.println("Total Old Salary of all Employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary of all Employees: " + totalNewSalary);
        sc.close();
    }
}
