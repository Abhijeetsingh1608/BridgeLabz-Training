import java.util.*;
public class SchoolBusAttendanceSystem {
    public static void main(String[] args) {  
	Scanner sc = new Scanner(System.in);
        String[] students = {
            "Amit", "Ravi", "Suresh", "Kiran", "Neha",
            "Pooja", "Rahul", "Anita", "Vikas", "Sneha"
        };
        int presentCount = 0;
        int absentCount = 0;

        for (String name : students) {
            System.out.print("Is " + name + " Present or Absent? (P/A): ");
            char status = sc.next().charAt(0);
            if (status == 'P' || status == 'p') {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Display result
        System.out.println("\n🚍 Attendance Summary 🚍");
        System.out.println("Total Present Students: " + presentCount);
        System.out.println("Total Absent Students : " + absentCount);

        sc.close();
    }
}
