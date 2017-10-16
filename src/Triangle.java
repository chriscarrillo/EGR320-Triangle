public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Default constructor creates a new triangle.
     * @param a the value of side A
     * @param b the value of side B
     * @param c the value of side C
     */
    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    /**
     * Compares the sides of the triangle to determine if the triangle is actually a triangle
     * @return true if the sides given do not equal a triangle
     */
    public boolean notATriangle() { return (sideA + sideB < sideC || sideA + sideC < sideB || sideC + sideB < sideA); }

    /**
     * Compares the sides of the triangles to determine if the triangle is equilateral
     * @return true if side A is equal to side B and side A is equal to side C
     */
    public boolean isEquilateral() { // all equal sides
        return (sideA == sideB && sideA == sideC);
    }

    /**
     * Compares the sides of the triangles to determine if the triangle is scalene
     * @return true if side A is not equal to side B and side A is not equal to side C
     */
    public boolean isScalene() { // 3 unequal sides
        return (sideA != sideB && sideA != sideC);
    }
}