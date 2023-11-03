/**
 * Workbook 5.10 - Roll Doubles
 * 
 * The user must keep rolling dice until they roll doubles!
 */

public class Doubles {
    public static void main(String[] args) {

        // Call the rollDice() function twice and store the values in variables
        int dice1 = rollDice();
        int dice2 = rollDice();

        // Print each variable
        System.out.println("\nDice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);

        // Set a loop that keeps running while the two dice are not the same
        int takes = 1;
        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("\nDice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            takes++;
        }
        if(takes == 1) {
            System.out.println("\nLucky! You rolled doubles after the first take!");
        } else {
            System.out.println("\nYou rolled doubles after " + takes + " takes!");
        }
    }

    /**
     * rollDice - returns a random number between 1 and 6
     * @return none
     */
    public static int rollDice() {
        return (int)(Math.random() * 6 + 1);
    }

}





