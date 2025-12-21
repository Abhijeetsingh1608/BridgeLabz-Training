import java.util.*;
//Create a class Quadratic to find the roots of the equation
public class Quadratic {
    //Declaring method
    public static double[] findTheRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        }
        //  one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        //  two roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    //Calling main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double[] roots = findTheRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } 
        else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } 
        else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        sc.close();
    }
}