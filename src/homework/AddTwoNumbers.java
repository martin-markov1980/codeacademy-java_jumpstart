package homework;

import java.util.Scanner;

/*
 *   Add Two Numbers Class
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum, secondNum;

        System.out.println("Please enter two numbers");
        System.out.println("Number One:");
        firstNum = scanner.nextDouble();
        System.out.println("Number Two:");
        secondNum = scanner.nextDouble();
        double result = firstNum + secondNum;
        System.out.println("The sum of your numbers is: " + result);

        System.out.println("Would you like to do another calculation ?");
        System.out.println("Please, only answer with \"Yes\" or \"No\"");
        String userAnswer = scanner.next();

        if (userAnswer.equalsIgnoreCase("Yes")) {
            do {
                System.out.println("Great!!!");
                System.out.println("Please enter two numbers");
                System.out.println("Number One:");
                firstNum = scanner.nextDouble();
                System.out.println("Number Two:");
                secondNum = scanner.nextDouble();
                result = firstNum + secondNum;
                System.out.println("The sum of your numbers is: " + result);
                System.out.println("Would you like to do another calculation ?");
                System.out.println("Please, only answer with \"Yes\" or \"No\"");
                userAnswer = scanner.next();
            } while (userAnswer.equalsIgnoreCase("Yes"));
        }
        if (userAnswer.equalsIgnoreCase("No")) {
            System.out.println("You enter \"No\", see you soon then!");
        } else {
            System.out.println("You enter invalid value please, re-start the program!");
        }
    }
}
