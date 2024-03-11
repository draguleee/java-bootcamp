/**
 * Immutable Class
 */

public class Immutable {
    public static void main(String[] args) {        

        // Store and print a single int value
        int apples = 5;     
        System.out.println(apples);
        
        // Create a new Integer object (variable stores an unique reference to the object)
        Integer applesWrapper = null;
        applesWrapper = 5;
        System.out.println(applesWrapper);

        // Store and print a single long value
        long stars = 1_000_000_000_000L;
        System.out.println(stars);

        // Create a new Long object (variable stores an unique reference to the object)
        Long starsWrapper = 1_000_000_000_000L;
        System.out.println(starsWrapper);

        // Store and print a single double value
        double decimal = 1.25;
        System.out.println(decimal);

        // Create a new Double object (variable stores an unique reference to the object)
        Double decimalWrapper = 1.25;
        System.out.println(decimalWrapper);

        // Store and print a single boolean value
        boolean bool = true;
        System.out.println(bool);

        // Create a new Boolean object (variable stores an unique reference to the object)
        Boolean boolWrapper = true;
        System.out.println(boolWrapper);

        // Store and print a single char value
        char letter = 'a';
        System.out.println(letter);

        // Create a new Character object (variable stores an unique reference to the object)
        Character letterWrapper = 'a';
        System.out.println(letterWrapper);

    }
}