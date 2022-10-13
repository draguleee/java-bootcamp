import java.util.Scanner;

// Workbook 5.11

public class JavaRolls {

    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to type anything to start the game
        System.out.println("Let's play Rolling Java. Type anything to start.");
        in.nextLine();

        // Print the rules
        System.out.println("\nGreat! Here are the rules:\n" + 
                            "- If you roll a 6, the game stops.\n" + 
                            "- If you roll a 4, nothing happens.\n" + 
                            "- Otherwise, you get one point.\n" + 
                            "You must collect at least 3 points to win.\n" + 
                            "\nEnter anything to roll: ");
        in.nextLine();

        // The score variable, which will be incremented after each roll
        int score = 0;

        // While loop to enter a random value 
        while(true) {
            int dice = rollDice();
            System.out.println("You rolled a " + dice + '.');
            if(dice == 6) {
                System.out.println("End of game.");
                break;
            }
            else if(dice == 4) {
                System.out.println("Zero points. Keep rolling.");
            }
            else {
                score++;
                System.out.println("One point. Keep rolling!");
            }
            in.nextLine();
        }

        // Check the user's points
        System.out.println("\nYour score is: " + score);
        if(score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        }
        else {
            System.out.println("Tough luck. You lose!");
        }

        // Close the Scanner
        in.close();
    }

    /**
     * Function name: rollDice - rolls a dice between 1 and 6
     * @return
     */
    public static int rollDice() {
        double random = (Math.random()*6)+1;
        int number = (int)random;
        return number;
    }
}
