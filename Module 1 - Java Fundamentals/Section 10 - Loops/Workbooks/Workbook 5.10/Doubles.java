/**
 * Workbook 5.10 - Roll Doubles
 * The user must keep rolling dice until they roll doubles!
 */

public class Doubles {
    public static void main(String[] args) {

        // Counter variable
        int counter = 1;

        // Start the game
        System.out.println("\nWelcome, friend!");
        System.out.println("In this game, you must roll a double to win.");
        System.out.println("Ready, go!");

        // Call the function twice and store the values in variables
        int dice1 = rollDice();
        int dice2 = rollDice();

        // Print each dice
        System.out.println("\nDice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);

        // Set up a loop that keeps runnin while the two dice are not the same
        // During each run, re-roll thedice and print both values.
        while(dice1 != dice2) {
            counter++;
            System.out.println("\nTry again!");
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }
        System.out.println("\nYou rolled doubles!");
        System.out.println("Total number of tries: " + counter + "\n");

    }

    /**
     * rollDice - function that returns a random number between 1 and 6
     * @return (int)
     */
    public static int rollDice() {
        return (int)(Math.random() * 6 + 1);
    }

}





