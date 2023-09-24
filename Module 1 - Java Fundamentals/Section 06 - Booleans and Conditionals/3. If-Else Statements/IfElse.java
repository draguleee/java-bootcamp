/**
 * If-Else Statements
 */

public class IfElse {

    public static void main(String[] args) {

        // Example 1
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("\nMe: Hi Java, did I score better in biology?");
        if(biologyGrade > chemistryGrade) {
            System.out.println("Java: Yes, you did. Congrats!");
        } else {
            System.out.println("Java: No, you did not.");
        }

        // Example 2
        double sales = 37.55;
        double costs = 5.55;
        System.out.println("\nMe: Hi Java, did we make money?");
        if(sales > costs) {
            System.out.println("Java: Yes. Good job!");
        } else {
            System.out.println("Java: No. Too bad!");
        }

        // Example 3
        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");
        if(temperature < targetTemperature) {
            System.out.println("Java: Yes");
        } else {
            System.out.println("Java: No.");
        }

        // Example 4
        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        if(currentSpeed < speedLimit) {
            System.out.println("Java: Yes. You are careful!");
        } else {
            System.out.println("Java: No. Take care, please!");
        }

        // Example 5
        int age = 45;
        int retirementAge = 65;
        System.out.println("\nMe: Hi Java, am I old enough to retire?");
        if(age >= retirementAge) {
            System.out.println("Java: You are ready to retire!");
        } else {
            System.out.println("Java: Nope... back to work for another " + (retirementAge - age) + " years.");
        }

        // Example 6
        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("\nMe: Hi Java, did I get the best possible grade?");
        if(myGrade == bestGrade) {
            System.out.println("Java: Yes. Congratulations!");
        } else {
            System.out.println("Java: No. But that's okay too!");
        }

        // Example 7
        String word = "hello";
        String secondWord = "hello";
        System.out.println("\nMe: Are the two words the same?");
        if(word.equals(secondWord)) {
            System.out.println("Java: Yes, they are the same.");
        } else {
            System.out.println("Java: No, they are different.");
        }

        // Example 8
        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("\nMe: Are the two words different");
        if(!thirdWord.equals(fourthWord)) {
            System.out.println("Java: Yes, they are different.");
        } else {
            System.out.println("Java: Bo, they are the same.");
        }

    }
}
