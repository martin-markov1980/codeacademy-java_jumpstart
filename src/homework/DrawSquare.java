package homework;

import java.util.Scanner;

/*
 *   Draw Square Class
 */

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1-30 to print a square");
        int userInputNumber = scanner.nextInt();

        if (userInputNumber >= 1 && userInputNumber <= 30) {
            String resultOutput = "";

            for (int row = 0; row < userInputNumber; row++) {
                for (int col = 0; col < userInputNumber; col++) {
                    resultOutput += "# ";
                }
                resultOutput += "\n";
            }
            System.out.println(resultOutput);
        }   else {
            System.out.println("Your number is out of range please, \nre-run the program and enter a number between 1-30 to print a square");
        }

    }
}
