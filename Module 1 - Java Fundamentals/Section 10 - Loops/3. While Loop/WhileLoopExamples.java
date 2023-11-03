/**
 * While Loops: 
 * - Designed to execute code an indefinite number of times.
 * - Keeps running while a condition is true.
 * - Components:
 *   while (condition) {}
 */

public class WhileLoopExamples {
    public static void main(String[] args) {

        // Example 1: Roll a dice until a 6 is rolled
        System.out.println();
        int diceRoll = -1;
        int rolls = 0;
        while (diceRoll != 6) {
            rolls++;
            diceRoll = rollDice();
            System.out.println("Roll #" + rolls + ": " + diceRoll);
        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        System.out.println();
        int randomNumber = -1;
        int generations = 0;
        while (randomNumber <= 90) {
            generations++;
            randomNumber = generateRandomNumber();
            System.out.println("Generation #" + generations + ": " + randomNumber);
        }

        // Example 3: Keep doubling a random number until it's greater than 1000
        System.out.println();
        int doubleRandom = generateRandomNumber();
        int doubling = 0;
        while (doubleRandom <= 1000) {
            doubling++;
            doubleRandom *= 2;
            System.out.println("Doubling #" + doubling + ": " + doubleRandom);
        }
    }

    /**
     * rollDice - generates a number between 1 and 6
     * @param   none
     * @return  none
     */
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * generateRandomNumber - generates a random number between 1 and 100
     * @param   none
     * @return  none
     */
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
