import java.util.Scanner;

// Dice Project

public class Dice {

    /**
     * Function name: main
     * @param args
     */
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Dice rolls
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        // Request the user to enter three numbers between 1 and 6
        System.out.println("Enter three numbers between 1 and 6: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        // Check if the numbers are in specified range
        if(num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than 1!");
            System.out.println("Shutting the game down...");
            System.exit(0);
        }
        if(num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be greater than 6!");
            System.out.println("Shutting the game down...");
            System.exit(0);
        }

        // calculate and print the sum of rolls and the numbers
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfRolls = roll1 + roll2 + roll3;
        System.out.println("\nDice sum = " + sumOfRolls);
        System.out.println("Number sum = " + sumOfNumbers);

        // Call the checkWin() function
        if(checkWin(sumOfRolls, sumOfNumbers)) {
            System.out.println("Congrats, you win!");
        }
        else {
            System.out.println("Sorry, you lose!");
        }

        // Close the Scanner
        in.close();
    }

    /**
     * Function name: rollDice - generates a number between 1 and 6
     * @return
     */
    public static int rollDice() {
        double randomNumber = (Math.random() * 6) + 1;
        return (int)randomNumber;
    }

    /**
     * Function name: checkWin - decide if the user wins or loses
     * @param sumOfRolls        (double)
     * @param sumOfNumbers      (double)
     */
    public static boolean checkWin(int sumOfRolls, int sumOfNumbers) {
        return (sumOfRolls < sumOfNumbers && sumOfNumbers - sumOfRolls < 3);
    }

}