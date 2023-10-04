package homework;

import java.util.Scanner;

/*
 *   Which month is it based on integer 1-12
 */
public class WhichMonthIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte month;

        System.out.println("Enter current month in a format 1-12 ex. 4");
        month = scanner.nextByte();

        switch (month)  {
            case 1:
                System.out.println("It's January.");
                break;
            case 2:
                System.out.println("It's February.");
                break;
            case 3:
                System.out.println("It's March.");
                break;
            case 4:
                System.out.println("It's April.");
                break;
            case 5:
                System.out.println("It's May.");
                break;
            case 6:
                System.out.println("It's June.");
                break;
            case 7:
                System.out.println("It's July.");
                break;
            case 8:
                System.out.println("It's August.");
                break;
            case 9:
                System.out.println("It's September.");
                break;
            case 10:
                System.out.println("It's October.");
                break;
            case 11:
                System.out.println("It's November.");
                break;
            case 12:
                System.out.println("It's December.");
                break;
            default:
                System.out.println("Your number is out of range");
        }

        scanner.close();
    }
}
