// Create a class pensDivision to divide pens equally among students
public class PensDivision {
    public static void main(String[] args) {

        // Create variables as totalPens,students,pensPerStudent and remainingPens
        int totalPens = 14;
        int students = 3;
        // Use(division operator)
        int pensPerStudent = totalPens / students;
        // Use (modulus operator)
        int remainingPens = totalPens % students;

        // Display the result
        System.out.println(
            "The Pen Per Student is " + pensPerStudent +
            " and the remaining pen not distributed is " + remainingPens
        );
    }
}
