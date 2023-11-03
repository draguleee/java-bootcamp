import java.util.Scanner;

/**
 * Pokerito (it's almost Poker!)
 * 
 * Pokerito is like Poker, but the rules are a lot simpler.
 * - The dealer will give you one card.
 * - The dealer will give the computer one card.
 * - Then, the dealer will draw five cards (the river).
 * - The player with the most river matches wins. If the matches are
 * equal, everyone's a winner!
 */

public class Pokerito {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Explain the rules to the player
        System.out.println("\nLet's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler: ");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw ten cards (the river)");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("\nReady, Type anything if you are.");
        scan.nextLine();

        // Present the user and the computer with a card
        String userCard = randomCard();
        System.out.println("Here's your card:\n" + userCard);
        scan.nextLine();
        String computerCard = randomCard();
        System.out.println("Here's the computer's card:\n" + computerCard);
        scan.nextLine();

        // Declare and initialize the number of your matches and the computer's matches
        int userMatches = 0;
        int computerMatches = 0;

        // Draw five cards (the river)
        System.out.println("\nNow, the dealer will draw ten cards. Press Enter to continue.");
        scan.nextLine();
        for (int i=0 ; i<9 ; i++) {
            String randomCard = randomCard();
            System.out.println("Card " + (i+1) + ":");
            System.out.println(randomCard);
            scan.nextLine();
            if (userCard.equals(randomCard)) {
                userMatches++;
            }
            if(computerCard.equals(randomCard)) {
                computerMatches++;
            }
        }

        // Display the final results
        System.out.println("Your matches: " + userMatches);
        System.out.println("Computer's matches: " + computerMatches);
        displayResults(userMatches, computerMatches);

        // Close the Scanner
        scan.close();
    }

    /** 
     * randomCard - returns a random card between 1 (Ace) and 13 (King).
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard() {
        int random = (int)(Math.random() * 13 + 1);
        switch (random) {
            case 1: 
            return  "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
            case 3:
            return  "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
            case 4:
            return  "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            case 7:
            return  "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default: return "This shouldn't run.";
        }
    }

    /**
     * checkWinner - checks the winner of the Pokerito game
     * @param userMatches       (int)
     * @param computerMatches   (int)
     * @return                  (boolean)
     */
    public static boolean checkWinner(int userMatches, int computerMatches) {
        return (userMatches > computerMatches);
    }

    public static void displayResults(int userMatches, int computerMatches) {
        if (userMatches == computerMatches) {
            System.out.println("Everyone wins!");
        } else if (checkWinner(userMatches, computerMatches)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

}
