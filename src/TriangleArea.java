import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Distance formula for triangle side lengths
        double sideAB = Math.sqrt(
                (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
        );

        double sideAC = Math.sqrt(
                (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)
        );

        double sideBC = Math.sqrt(
                (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)
        );

        double semiPerimeter = (sideAB + sideBC + sideAC) / 2;

        // Heron's formula for triangle area
        double area = Math.sqrt(
                semiPerimeter
                        * (semiPerimeter - sideAB)
                        * (semiPerimeter - sideBC)
                        * (semiPerimeter - sideAC)
        );

        System.out.printf("Triangle area: %.2f%n", area);

    }

}
