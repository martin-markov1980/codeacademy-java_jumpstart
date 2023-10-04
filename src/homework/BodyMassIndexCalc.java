package homework;

import java.util.Scanner;

/*
 *   Body Mass Index Calculator using if statements
 *   Using the status measures in kilograms from this calculator:
 *   https://www.calculatorsoup.com/calculators/health/bmi-calculator.php
 */
public class BodyMassIndexCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight;
        float height;
        float bmiResult;
        boolean validWeightInput;
        boolean validHeightInput;

        System.out.println("Please enter your weight in kilograms ex. 78.5");
        weight = scanner.nextFloat();
        System.out.println("Please enter your height in meters ex. 1.75");
        height = scanner.nextFloat();

        validWeightInput = weight > 0;
        validHeightInput = height > 0;

        // User input validation
        while (!validWeightInput || !validHeightInput) {
            System.out.println("You either enter 0 or negative number for your height, or for your weight. Please, makes sure you are using positive values for both.");
            System.out.println("Please enter your weight in kilograms ex. 78.5");
            weight = scanner.nextFloat();
            validWeightInput = weight > 0;
            System.out.println("Please enter your height in meters ex. 1.75");
            height = scanner.nextFloat();
            validHeightInput = height > 0;
        }

        // Calculating the BMI index
        bmiResult = (float) (weight / Math.pow(height, 2));

        // Outputting the result based on the bmiResult value
        if (bmiResult <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmiResult >= 18.5 && bmiResult <= 24.9) {
            System.out.println("You are Normal.");
        } else if (bmiResult >= 25 && bmiResult <= 39.9) {
            System.out.println("You are Overweight.");
        }   else {
            System.out.println("You are Obese.");
        }
    }
}
