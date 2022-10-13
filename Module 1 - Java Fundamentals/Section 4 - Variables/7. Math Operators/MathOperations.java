// Math Operators

public class MathOperations {
    public static void main(String[] args) {
        
        // Int variables
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        // Long variables
        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        // Double variables
        double testScore = 6.7;
        double bonusMarks = 2.5;

        // Addition (+)
        System.out.println("\nFred and George collected " + (bagOfSweets1+bagOfSweets2) + " sweets.");
        System.out.println("There are " + (starsInMilkyWay+starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore+bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled.");

        // Subtraction (-)
        System.out.println("\nFred has " + (bagOfSweets2-bagOfSweets1) + " more sweets than George.");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda-starsInMilkyWay) + " more stars than the Milky Way.");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore-bonusMarks) + " on his potions test.");

        // Multiplication (*)
        System.out.println("\nFred and George used a special spell to multiply their sweets to: " + (bagOfSweets1*bagOfSweets2) + ".");
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore*bonusMarks) + "/10.");

        // Division (/)
        System.out.println("\nOriginally, Fred had " + (bagOfSweets2/bagOfSweets1) + " times more sweets than George.");
        System.out.println("Andromeda has " + (starsInAndromeda/starsInMilkyWay) + " times more stars.");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore/bonusMarks) + ".\n");
    
        // Modulus (%)
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10%2) + ".");
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5%2) + ".");

        // Add 1 operator (++)
        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("\nI count: " + counter + ".");

        // Subtract 1 operator (--)
        counter--;
        counter--;
        System.out.println("I decreased the value of counter to: " + counter + ".");
    
        // Add by operator (+=)
        int passengers = 0;
        passengers += 9;
        passengers += 3;
        System.out.println("\nNumber of passengers after the first station: " + passengers);

        // Subtract by operator (-=)
        passengers -= 4;
        passengers -= 2;
        System.out.println("Number of passengers after the second station: " + passengers);

        // Multiply by operator (*=)
        int kittens = 2;
        kittens *= 4;
        System.out.println("\nNumber of kittens in the yard after a single pspsps: " + kittens);

        // Divide by operator (/=)
        kittens /= 2;
        System.out.println("Number of milk drunk kittens: " + kittens + "\n");

    }

}
