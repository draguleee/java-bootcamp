import java.util.Scanner;

/**
 * Dice Project
 * 
 * So far, you have learned:
 * - Organize your coed into functions
 * - Define functions that take parameters
 * - Call functions and pass in arguments
 * - Return values
 * 
 * Rules of the Dice Jack game:
 * - The user needs to pick three numbers         (4 3 5)  SUM = 12
 * - The user needs to roll the dice three times  (3 4 4)  SUM = 11
 * - The user wins if:
 *   * The sum of dice rolls is smaller than the sum of numbers you chose
 *   * AND the difference between the two numbers is less than five
 * 
 * Tasks:
 * - Roll the dice
 * - Check if the user won
 */
public class Dice {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Pick the three numbers
        System.out.println("\nTime to choose the numbers!");
        System.out.print("Enter three numbers (between 1 and 6): ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        // Check if the chosen numbers are in the range (1 - 6)
        if(areLessThanOne(number1, number2, number3)) {
            System.err.println("Error: Impossible!\n");
            System.exit(0);
        }
        if(areGreaterThanSix(number1, number2, number3)) {
            System.err.println("Error: Impossible!\n");
            System.exit(0);

        }

        // Roll the dice
        System.out.println("\nNow, it's time to roll the dice!");
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("The dice rolled: " + roll1 + " " + roll2 + " " + roll3);

        // Check if the user won
        int sumOfNumbers = number1 + number2 + number3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;
        int margin = sumOfNumbers - sumOfDiceRolls;
        System.out.println("\nSum of the numbers you chose: " + sumOfNumbers);
        System.out.println("Sum of the dice rolls: " + sumOfDiceRolls);
        System.out.println("Margin: " + margin);
        if(checkWin(sumOfNumbers, sumOfDiceRolls)) {
            System.out.println("\nYou won!");
        } else {
            System.out.println("\nYou lose. Try again though!");
        }
    }

    /**
     * rolLDice  -returns an integer number between 1 and 6
     * @param none
     * @return int
     */
    public static int rollDice() {
        return (int)(Math.random()*6+1);
    }

    /**
     * areLessThanOne - checks if the numbers are smaller than 1
     * @param number1
     * @param number2
     * @param number3
     * @return none
     */
    public static boolean areLessThanOne(int number1, int number2, int number3) {
        return (number1 < 1 || number2 < 1 || number3 < 1);
    }

    /**
     * areGreaterThanSix - checks if the numbers are greater than 6
     * @param number1
     * @param number2
     * @param number3
     * @return none
     */
    public static boolean areGreaterThanSix(int number1, int number2, int number3) {
        return (number1 > 6 || number2 > 6 || number3 > 6);
    }

    /**
     * checkWin - checks if the user won
     * @param sumOfNumbers
     * @param sumOfDiceRolls
     * @return none
     */
    public static boolean checkWin(int sumOfNumbers, int sumOfDiceRolls) {
        return ((sumOfDiceRolls < sumOfNumbers) && (sumOfNumbers - sumOfDiceRolls < 5));
    }

}