package homework;

/*
 *   Is the day in a Spring range
 */
public class SpringSeason {
    public static void main(String[] args) {
        // Two variables to hold the input as an example
        byte day = 19;
        byte month = 4;

        // Малко тегаво без if statments тук :)
        boolean isSpring = ((day >= 20 && day <= 31) && month == 3) || ((day >= 1 && day <= 31) && (month == 4 || month == 5)) || ((day >= 1 && day <= 20) && month == 6) ? true : false;

        System.out.println(isSpring);
    }
}
