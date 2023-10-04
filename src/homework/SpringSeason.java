package homework;

/*
 *   Spring Season using if statements
 */

import java.util.Scanner;

// boolean isSpring = ((day >= 20 && day <= 31) && month == 3) || ((day >= 1 && day <= 31) && (month == 4 || month == 5)) || ((day >= 1 && day <= 20) && month == 6) ? true : false;
public class SpringSeason {
    public static void main(String[] args) {
        byte day;
        byte month;

        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.println("Please enter a day in a numeric format 1-31 ex. 17:");
        day = scanner.nextByte();
        System.out.println("Please enter a month in a numeric format 1-12 ex. 4:");
        month = scanner.nextByte();

        if (((day >= 20 && day <= 31) && month == 3) || ((day >= 1 && day <= 31) && (month == 4 || month == 5)) || ((day >= 1 && day <= 20) && month == 6)) {
            System.out.println("Your date is in the Spring Season");
        }   else {
            System.out.println("Your date is not in the Spring Season");
        }

        scanner.close();
    }
}
