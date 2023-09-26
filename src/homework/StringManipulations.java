package homework;

/*
 * Class, who prints in the console string count,
 * string in uppercase and string in lowercase
 */
public class StringManipulations {
    public static void main(String[] args) {
        String myFirstName = "Martin";

        int myFirstNameTotalLetterCount = myFirstName.length();
        String myFirstNameCapitalized = myFirstName.toUpperCase();
        String myFirstNameInLowerCase = myFirstName.toLowerCase();

        System.out.println(myFirstNameTotalLetterCount);
        System.out.println(myFirstNameCapitalized);
        System.out.println(myFirstNameInLowerCase);
    }
}
