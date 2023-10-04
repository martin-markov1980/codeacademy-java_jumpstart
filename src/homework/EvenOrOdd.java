package homework;

import java.util.Scanner;

/*
 *   Calculate if a given number is even or odd
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer below:");
        userNumber = scanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("The number you entered is Even");
        }   else {
            System.out.println("The number you entered is Odd");
        }

        scanner.close();
    }
}
