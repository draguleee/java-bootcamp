import java.util.Scanner;

/**
 * Workbook 5.11 - JavaRolls!
 */

public class JavaRolls {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Print the rules to the user
        System.out.println("\nLet's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules: ");
        System.out.println("\t- If you roll a 6, the game stops.");
        System.out.println("\t- If you roll a 4, nothing happens.");
        System.out.println("\t- Otherwise, you get 1 point.");
        System.out.println("\nYou must collect at least 3 points to win.");
        System.out.println("Enter anything to roll: ");

        // Make a while loop that runs forever
        int score = 0;
        while (true) {
            scan.nextLine();
            int diceRoll = rollDice();
            String result = "You rolled a " + diceRoll + ".";
            if (diceRoll == 6) {
                System.out.println(result);
                break;
            } else if (diceRoll == 4) {
                System.out.println(result + " Keep rolling.");
            } else {
                score++;
                System.out.println(result + " +1 point!");
            }
        }
        System.out.println("End of game.");

        // Check if the user won and print the results
        System.out.println("\nYour score is " + score + ".");
        printResults(score);

        // Close the Scanner
        scan.close();

    }

    /**
     * rollDice - function that returns a number between 1 and 6
     * @return (int)
     */
    public static int rollDice() {
        return (int)(Math.random() * 6 + 1);
    }

    /**
     * checkScore - function that checks if the player won
     * @param score
     * @return
     */
    public static boolean checkScore(int score) {
        return (score > 3);
    }

    /**
     * printResults - prints the results of the game
     * @param score
     */
    public static void printResults(int score) {
        if(checkScore(score)) {
            System.out.println("You win! Congratulations!");
        } else {
            System.out.println("Tough luck. You lose.");
        }
    }
  
  

  
  
}
