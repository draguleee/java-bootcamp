/**
 * Operators:
 * + (plus) : adds two values
 * - (minus) : subtracts two values
 * * (multiplication) : multiplies two values
 * / (division) : divides two values
 * % (modulus) : returns the remainder of a division
 * ++ (add 1) : increases the value by 1
 * -- (subtract 1): decreases the value by 1
 * += (add by) : increases the value by the number on the right
 * -= (subtract by): decreases the value by the number on the right
 */

public class MathOperators {
    public static void main(String[] args) {
        
        // Variables of type int
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        // Variables of type long
        long starsInMilkywWay = 250_000_000_000L;
        long starsInAndromeda = 1_000_000_000_000L;

        // Variable of type double
        double testScore = 6.7;
       
        // Addition
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets.");
        System.out.println("There are " + (starsInMilkywWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        
        // Subtraction
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George.");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkywWay) + " more stars than the Milky Way.");
        
        // Multiplication and Division
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.25) + "/10.");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2.0) + ".");

        // Modulus
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2) + ".");
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2) + ".");

        // Add 1 operator
        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println(counter);

        // Subtract 1 operator
        counter--;
        counter--;
        counter--;
        System.out.println(counter);

        // Add by operator
        int apples = 0;
        apples += 10;
        apples += 2;
        apples += 7;
        System.out.println(apples);

        // Subtract by operator
        apples -= 8;
        apples -= 3;
        apples -= 5;
        System.out.println(apples);

    }
    
}