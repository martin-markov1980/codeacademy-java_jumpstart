package homework;

/*
 *   Class for homework String manipulations
 */
public class StringManipulations {
    public static void main(String[] args) {
        // Task one below
        System.out.println("Task one starts here");
        String myName = "Martin";
        System.out.println(myName);

        // Task two below
        System.out.println("Task two starts here");

        String friendName = "Mitko";

        System.out.println(myName.equals(friendName));

        System.out.println(myName.equalsIgnoreCase(friendName));

        System.out.println(myName.compareTo(friendName));

        // Task three below
        System.out.println("Task three starts here");

        String myFamilyName = "Markov";
        System.out.println(myName + "\n" + myFamilyName);

        // Task four below
        System.out.println("Task four starts here");

        byte myAge = 42;
        System.out.println(myAge);

        // Task five below
        System.out.println("Task five starts here");

        char tabSpace = '\t';
        System.out.println(myName + tabSpace + myFamilyName + tabSpace + myAge);

        // Task six below
        System.out.println("Task six starts here");

        String friendFamilyName = "Raychev";
        byte friendAge = 41;

        // Mixing concatenation methods below
        System.out.println(friendName.concat("\t").concat(friendFamilyName) + tabSpace + friendAge);
    }
}
