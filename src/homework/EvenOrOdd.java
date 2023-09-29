package homework;

import java.util.Scanner;

/*
 *   Calculate if a given number is even or odd
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        result = scanner.nextDouble() % 2 == 0 ? "Even" : "Odd";

        System.out.printf("Your number is: %s", result);

    }
}
