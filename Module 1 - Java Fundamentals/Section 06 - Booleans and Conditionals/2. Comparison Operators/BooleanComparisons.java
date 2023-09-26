/**
 * Boolean Comparisons & Operators
 * - Operators that check for equality: == , !=
 * - Operators that allow to compare relative sizes: > , >= , < , <=
 * 
 * Operators and definitions:
 * > (greater than): returns true if the value on the left is greater than the value on the right.
 * < (less than): returns true if the value on the left is less than the value on the right.
 * >= (greater than or equal to): returns true if the value on the left is greater than or equal to the value on the right.
 * <= (less than or equal to): returns true if the value on the left is less than or equal to the value on the right.
 * == (equal): returns true if two values are equal.
 * != (not equal): returns true if two values are not equal.
 * 
 * Cmparing String is Java:
 * - Never use == or != to compare String values, you will get inconsistent results!
 * - Always use:
 *   equals(): returns true if two Strings are the same.
 *   !equals(): returns true if two Strings are different.
 */

public class BooleanComparisons {
    public static void main(String[] args) {
        
        // Example 1 - greater than operator
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + "\n");
        
        // Example 2 - greater than operator
        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        System.out.println("Java: " + (sales > costs) + "\n");

        // Example 3 - less than operator
        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        System.out.println("Java: " + (temperature < targetTemperature) + "\n");

        // Example 4 - less than operator
        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        System.out.println("Java: " + (currentSpeed < speedLimit) + "\n");

        // Example 5 - greater then or equal to operator
        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        System.out.println("Java: " + (age >= retirementAge) + "\n");

        // Example 6 - less than or equal to operator
        double salary = 50000.0;
        double maxSalary = 60000.0;
        System.out.println("Me: Hi Java, is my salary less than or equal to the maximum salary?");
        System.out.println("Java: " + (salary <= maxSalary) + "\n");

        // Example 7 - equal operator
        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        System.out.println("Java: " + (myGrade == bestGrade) + "\n");
        
        // Example 8 - equal operator
        int phoneNumber = 5551234;
        int contactNumber = 5551234;
        System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
        System.out.println("Java: " + (phoneNumber == contactNumber) + "\n");
        
        // Example 9 - not equal operator
        char letter1 = 'a';
        char letter2 = 'b';
        System.out.println("Me: Hi Java, are these two letters different?");
        System.out.println("Java: " + (letter1 != letter2) + "\n");
        
        // Example 10 - not equal operator
        long distance1 = 1000L;
        long distance2 = 500L;
        System.out.println("Me: Hi Java, are these two distances not equal?");
        System.out.println("Java: " + (distance1 != distance2) + "\n");

        // Example 11 - equals() method for Strings (objects)
        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        System.out.println("Java: " + (word.equals(secondWord)) + "\n");

        // Example 12 - !equals() method for Strings (objects)
        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        System.out.println("Java: " + (!thirdWord.equals(fourthWord)) + "\n");

    }
}