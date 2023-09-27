package homework;

/*
*   Distance calculator
*/
public class Distance {
    public static void main(String[] args) {
        // Two variables to hold the input as an example
        double x = 17;
        double y = 19;

        double distanceResult = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println(distanceResult);
    }
}
