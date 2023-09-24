import java.util.Scanner;

/**
 * Workbook 5.11 - Java Rolls
 */

public class JavaRolls {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Print the rules to the user
        System.out.println("\nLet's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("\nGreat! Here are the rules: ");
        System.out.println(" - If you roll a 6, the game stops.");
        System.out.println(" - If you roll a 4, nothing happens.");
        System.out.println(" - Otherwise, you get 1 point. \n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");

        // While loop that runs forever
        int dice;
        int counter = 0;
        while(true) {
            scan.nextLine();
            dice = rollDice();
            if(dice == 6) {
                System.out.print("You rolled a " + dice + ". End of game.");
                break;
            } else if(dice == 4) {
                System.out.println("You rolled a " + dice + ". Zero points. Keep rolling!");
                continue;
            } else {
                System.out.println("You rolled a " + dice + ". One point. Keep rolling!");
                counter++;
            }
        }
        if(counter >= 3) {
            System.out.println("\n\nWow, that's lucky. You win!");
        } else {
            System.out.println("\n\nTough luck, you lose.");
        }
        System.out.println("Points: " + counter);
        
        // Close the Scanner
        scan.close();

    }

    /**
     * rollDice - function that returns a random number between 1 and 6
     * @return
     */
    public static int rollDice() {
        return (int)(Math.random() * 6 + 1);
    }
  
}
