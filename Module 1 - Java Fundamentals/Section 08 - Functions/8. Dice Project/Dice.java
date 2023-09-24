import java.util.Scanner;

/**
 * Dice Jack
 * 
 * Rules:
 * - The user needs to pick three numbers           (4 3 5) => SUM: 12
 * - The user needs to roll the dice three times    (3 4 4) => SUM: 11
 * - The user wins if:
 *   * The sum of dice rolls is smaller than the sum of numbers you chose
 *   * The difference between the two numbers is less than three
 * 
 * Tasks: 
 * - Roll the dice
 * - Check if the user won
 * 
 * 
 * Questions:
 * 
 * Question 1: How can we return a decimal between 0 to less than 6?
 * Answer: Multiply the result from MAth.random() to 6.
 * 
 * Question 2: How can our code return a decimal between 1 and less than 7?
 * Answer: Add 1 to the result.
 * 
 */

public class Dice {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Pick the three numbers
        System.out.println("\nWelcome to Dice Jack!");
        System.out.print("Please pick three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(areLessThanOne(num1, num2, num3)) {
            System.err.println("Error: One or more of the numbers is smaller than 1!");
            System.exit(0);
        }
        if(areGreaterThanSix(num1, num2, num3)) {
            System.err.println("Error: One or more of the numbers is greater than 6!");
        }

        // Calculate the sum of the three numbers
        int sumOfNumbers = num1 + num2 + num3;
        System.out.println("Cool. The sum of the three numbers you've picked is: " + sumOfNumbers);

        // Roll the dice 3 times
        System.out.println("\nNow it's turn to roll the dice three times. Go!");
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("Rolls: " + roll1 + " " + roll2 + " " + roll3);

        // Calculate the sum of the three rolls
        int sumOfRolls = roll1 + roll2 + roll3;
        System.out.println("Cool. The sum of the three rolls is: " + sumOfRolls);

        // Check if the user won or not
        if(checkWin(sumOfNumbers, sumOfRolls)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nSorry, mate. You lost. But please try again though!");
        }
        checkWin(sumOfNumbers, sumOfRolls);
    }

    /**
     * rollDice - function that returns a random number between 1 and 6.
     * @param none
     * @return none 
     */
    public static int rollDice() {
        // Math.random() : 0 - 0.999999999999
        double random = (6* Math.random()) + 1;     // (0 - 5.999999999999) + 1 => 1 - 6.999999999999
        return (int) random;                        // 1 - 6
    }

    /**
     * areLessThanOne - function that checks if the chosen numbers are less than one
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return     (boolean)
     */
    public static boolean areLessThanOne(int num1, int num2, int num3) {
        return (num1 < 0 || num2 < 0 || num3 < 0);
    }

    /**
     * areGreaterThanSix - function that checks if the chosen numbers are greater than six
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static boolean areGreaterThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean checkWin(int sumOfNumbers, int sumOfRolls) {
        return (sumOfNumbers > sumOfRolls && (sumOfNumbers - sumOfRolls) < 3);
    }
    
}