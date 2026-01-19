package com.Scenariobased.geomeasuresolutions;
import java.util.*;
public class GeoMeasureSolutionsMain {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();

        System.out.println("How many line comparisons? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n * 2; i++) {

            System.out.println("Enter coordinates for Line " + i);
            System.out.print("x1 y1 x2 y2: ");

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            Line line = new Line(x1, y1, x2, y2);
            lines.add(line);
        }

        System.out.println("\n--- Line Comparisons ---");

        for (int i = 0; i < lines.size(); i += 2) {
            System.out.println("\nComparison " + (i / 2 + 1));
            LineComparator.compare(lines.get(i), lines.get(i + 1));
        }
    }
}
