package homework;

import java.util.Scanner;

/*
 *   Find the type of triangle
 */
public class TriangleType {
    public static void main(String[] args) {
        // Defining 3 double variables inline just for practice
        int sideA, sideB, sideC;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A in cm");
        sideA = scanner.nextInt();
        System.out.println("Please enter side B in cm");
        sideB = scanner.nextInt();
        System.out.println("Please enter side C cm");
        sideC = scanner.nextInt();

        if (sideA == sideB && sideA == sideC) {
            System.out.println("The triangle is equilateral (равностранен))");
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("The triangle is isosceles (равнобедрен)");
        } else {
            System.out.println("The triangle is scalene (разностранен)");
        }
    }
}
