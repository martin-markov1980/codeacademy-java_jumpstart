package homework;

/*
 *   Body Mass Index Calculator
 */
public class BodyMassIndexCalc {
    public static void main(String[] args) {
        // Two variables to hold the input as an example
        double heightInMeters = 1.85; // height In Meters ex. 1.80
        double weightInKg = 80.4;  // weight in kilograms ex. 85.3

        double bmi = weightInKg / Math.pow(heightInMeters , 2);

        System.out.println(bmi);

    }
}
