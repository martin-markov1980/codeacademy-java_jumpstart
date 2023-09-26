package homework;

/*
 * Numbers power of two
 */
public class NumbersPowerOfTwo {
    public static void main(String[] args) {
        int numberOne = -20;
        int numberTwo = 92;
        int numberThree = 638;
        int numberFour = 73;
        int numberFive = 200;
        int numberSix = -22;

        double numberOnePowOfTwo = Math.pow(numberOne, 2);
        double numberTwoPowOfTwo = Math.pow(numberTwo, 2);
        double numberThreePowOfTwo = Math.pow(numberThree, 2);
        double numberFourPowOfTwo = Math.pow(numberFour, 2);
        double numberFivePowOfTwo = Math.pow(numberFive, 2);
        double numberSixPowOfTwo = Math.pow(numberSix, 2);

        System.out.println(numberOnePowOfTwo + "\t" + numberTwoPowOfTwo + "\t" + numberThreePowOfTwo + "\t" + numberFourPowOfTwo + "\t" + numberFivePowOfTwo + "\t" + numberSixPowOfTwo);
    }
}
