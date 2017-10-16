import java.util.Scanner;

public class UseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideA = 0.0;
        double sideB = 0.0;
        double sideC = 0.0;
        boolean cont = true;

        while (cont) {
            sideA = triangleHelper(input, "A");
            sideB = triangleHelper(input, "B");
            sideC = triangleHelper(input, "C");

            // Create a new triangle
            Triangle tri = new Triangle(sideA, sideB, sideC);

            // Check which type of triangle it is
            if (tri.notATriangle()) {
                System.out.println("That is not a triangle");
            } else if (tri.isScalene()) {
                System.out.println("That is a scalene triangle");
            } else if (tri.isEquilateral()) {
                System.out.println("That is an equilateral triangle");
            } else {
                System.out.println("That is an isosceles triangle");
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (Y/N): ");
            String ans = input.next().toLowerCase();
            System.out.println();

            // If the answer is "y", continue, otherwise, don't
            if (ans.equals("y")) {
                cont = true;
            } else {
                cont = false;
            }
        }
    }

    private static double triangleHelper(Scanner input, String side) {
        boolean sideErr = false;
        boolean numErr = false;
        double sideToReturn = 0.0;

        do {
            System.out.print("Side " + side + ": ");
            if (input.hasNextDouble()) {
                sideToReturn = input.nextDouble();
                if (sideToReturn <= 0) {
                    numErr = true;
                    System.out.println("The lengths of the sides of the triangle must be positive\n");
                } else {
                    numErr = false;
                    sideErr = false;
                }
            } else {
                sideErr = true;
                input.next();
                System.out.println("This is not a number. Please type a number\n");
            }
        } while (sideErr || numErr);

        return sideToReturn;
    }
}