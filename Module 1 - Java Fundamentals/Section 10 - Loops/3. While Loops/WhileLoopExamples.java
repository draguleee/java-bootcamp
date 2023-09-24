import java.util.Scanner;

/**
 * While Loops:
 * - Designed to execute code an indefinite number of times
 * - Keeps running while a condition is true
 */

public class WhileLoopExamples {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner in = new Scanner(System.in);

        // Example 1: Roll a dice until a 6 is rolled
        int dice = in.nextInt();
        while(dice != 6) {      // As long as dice is not equal to 6, the loop runs
            dice = rollDice();
            System.out.print(dice + " ");
        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        System.out.println("\n");
        int random = generateRandomNumber();
        while(random < 90) {
            random = generateRandomNumber();
            System.out.print(random + " ");
        }

        // Example 3: Keep doubling a random number until it's greater than 1000
        System.out.println("\n");
        int number = 1;
        while(number < 1000) {
            number *= 2;
            System.out.print(number + " ");
        }
    }

    /**
     * rullDice - function that simulates rolling a dice (returns a random integer between 1 and 6)
     * @return int
     */
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * generateRandomNumber - function to generate a random integer between 1 and 100
     * @return int
     */
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
