package homework;

/*
 * Absolute value of numbers
 */
public class AbsoluteValue {
    public static void main(String[] args) {
        int numberOne = -147;
        int numberTwo = 15;
        int numberThree = 0;
        int numberFour = 18;

        int numberOneAbsoluteValue = Math.abs(numberOne);
        int numberTwoAbsoluteValue = Math.abs(numberTwo);
        int numberThreeAbsoluteValue = Math.abs(numberThree);
        int numberFourAbsoluteValue = Math.abs(numberFour);


        System.out.println(numberOneAbsoluteValue + "\t" + numberTwoAbsoluteValue + "\t" + numberThreeAbsoluteValue + "\t" + numberFourAbsoluteValue);

    }
}
