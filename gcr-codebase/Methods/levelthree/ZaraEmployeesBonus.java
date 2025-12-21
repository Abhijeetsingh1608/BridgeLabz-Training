import java.util.*;
//Create a class ZaraEmployeesBonus to calculate employee bonus
public class ZaraEmployeesBonus {
    // Method to generate salary (5-digit) and years of service
    // 2D Array: [employee][0 = salary, 1 = years of service]
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2];
        for (int i = 0; i < employees; i++){ 
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }
    // Method to calculate new salary and bonus
    // Returns 2D Array: [employee][0 = new salary, 1 = bonus]
    public static int[][] calculateBonus(int[][] employeeData) {
        int[][] updatedData = new int[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            int bonus;
            if (years > 5) {
                bonus = (int)(salary * 0.05); // 5% bonus
            } else {
                bonus = (int)(salary * 0.02); // 2% bonus
            }
            updatedData[i][0] = salary + bonus; // new salary
            updatedData[i][1] = bonus;          // bonus amount
        }
        return updatedData;
    }
    // Method to calculate and display totals in tabular format
    public static void displayReport(int[][] oldData, int[][] newData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;
        System.out.println(" ");
        System.out.println("Emp | Old Salary | Years | Bonus | New Salary");
        System.out.println(" ");

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            int bonus = newData[i][1];
            int newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%3d | %10d | %5d | %5d | %10d%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("TOTAL OLD SALARY  : " + totalOldSalary);
        System.out.println("TOTAL BONUS      : " + totalBonus);
        System.out.println("TOTAL NEW SALARY : " + totalNewSalary);
        System.out.println("---------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {

        int employees = 10;

        // Generate employee salary and years of service
        int[][] employeeData = generateEmployeeData(employees);

        // Calculate bonus and new salary
        int[][] updatedData = calculateBonus(employeeData);

        // Display results
        displayReport(employeeData, updatedData);
    }
}
