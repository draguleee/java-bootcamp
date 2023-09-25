/**
 * Math Operators:
 * + (plus): adds two values
 * - (minus): subtracts two values
 * * (multiplication): multiplies two values
 * / (division): divide two numbers
 * % (modulus): returns the remainder of the division
 * ++ (add 1): increases the value by 1
 * -- (subtract 1): decreases the value by 1
 * += (add by): increases the value by the number of the right
 * -= (subtract by): decreases the value by the number of the right
 * *= (multiply by): multiplies the value by the number of the right
 * /= (divide by): divides the value by the number of the right
 */

public class MathOperators {
    public static void main(String[] args) {

        // Variables bagOfSweets 1 andbagOfSweets2 of type int
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        // Variables starsInMilkyWay and starsInAndromeda of type long
        long starsInMilkyWay = 250_000_000_000L;        //250 billion
        long starsInAndromeda = 1_000_000_000_000L;     // 1 trillion

        // Variable testScore of type double
        double testScore = 6.7;

        // Perform the sum
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInAndromeda + starsInMilkyWay) + " stars in the Milky Way and Andromeda galaxies.");

        // Perform the subtraction
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) +" more stars than the Milky Way");

        // Perform the multiplication and division
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.25) + "/10");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2.0) + ".");
        
        // Perform the modulus calculation
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2) + ".");
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2) + ".");

        // Add 1 operator
        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("Counter increased: " + counter);

        // Subtract 1 operator
        counter--;
        counter--;
        counter--;
        System.out.println("Counter decreased: " + counter);

        // Add by operator
        int passengers = 0;
        passengers += 9;
        passengers += 5;
        passengers += 10;
        System.out.println("Passengers (adding): " + passengers);

        // Subtract by operator
        passengers -= 4;
        passengers -= 3;
        passengers -= 8;
        System.out.println("Passengers (subtracting): " + passengers);

        // Multiply by operator
        passengers *= 2;
        passengers *= 3;
        System.out.println("Passengers (multiplying): " + passengers);

        // Divide by operator
        passengers /= 6;
        passengers /= 9;
        System.out.println("Passengers (dividing): " + passengers);

    }
}