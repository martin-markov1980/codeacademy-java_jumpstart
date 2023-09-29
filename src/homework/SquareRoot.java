package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *   Square root of a given number to the fifth digit after decimal
 */
public class SquareRoot {
    public static void main(String[] args) {
        double userInputNumber;
        double outputNumberResult;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number below:");

        userInputNumber = scanner.nextDouble();

        DecimalFormat format = new DecimalFormat("0.######");

        outputNumberResult = Math.sqrt(userInputNumber);

        System.out.printf("The square root number of " + format.format(userInputNumber) + " is: %,.5f", outputNumberResult);
    }
}
