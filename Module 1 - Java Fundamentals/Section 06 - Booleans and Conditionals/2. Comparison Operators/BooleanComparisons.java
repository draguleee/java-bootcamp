/**
 * Comparisons:
 * == : equal - returns true if two values are equal
 * != : not equal - returns true if two values are not equal
 * >= : greater than or equal to - returns true if the left value is greater than or equal to the right value
 * > : greater than - returns true if the left value is greater than right value
 * < : less than - returns true if the left value is less than the right value
 * <= : less or equal than - returns true if the left value is less than or equal to the right value
 */

public class BooleanComparisons {
    public static void main(String[] args) {
        
        // "greater than" comparison - returns false
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + "\n");
        
        // "greater than" comparison - returns true
        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        System.out.println("Java: " + (sales > costs) + "\n");

        // "less than" comparison - returns true
        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        System.out.println("Java: " + (temperature < targetTemperature) + "\n");

        // "less than" comparison - returns true
        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        System.out.println("Java: " + (currentSpeed < speedLimit) + "\n");

        // "greater tha or equal to" comparison - returns false
        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        System.out.println("Java: " + (age >= retirementAge) + "\n");

        // "less than or equal to" cmparison - retusn true
        double salary = 50000.0;
        double maxSalary = 60000.0;
        System.out.println("Me: Hi Java, is my salary less than or equal to the maximum salary?");
        System.out.println("Java: " + (salary <= maxSalary) + "\n");

        // "equal to" comparison - returns true
        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        System.out.println("Java: " + (myGrade == bestGrade) + "\n");
        
        // "equal to" comparison - returns true
        int phoneNumber = 5551234;
        int contactNumber = 5551234;
        System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
        System.out.println("Java: " + (phoneNumber == contactNumber) + "\n");
        
        // "not equal to" comparison - returns true
        char letter1 = 'a';
        char letter2 = 'b';
        System.out.println("Me: Hi Java, are these two letters different?");
        System.out.println("Java: " + (letter1 != letter2) + "\n");
        
        // "no equal to" comparison - returns true
        long distance1 = 1000L;
        long distance2 = 500L;
        System.out.println("Me: Hi Java, are these two distances not equal?");
        System.out.println("Java: " + (distance1 != distance2) + "\n");

        // equals() method for String type! (returns true)
        // Never use == or != to compare String values; you will get inconsistent results
        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        System.out.println("Java: " + (word.equals(secondWord)) + "\n");

        // equals() method for String type! (returns true)
        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        System.out.println("Java: " + (!thirdWord.equals(fourthWord)) + "\n");

    }
    
}