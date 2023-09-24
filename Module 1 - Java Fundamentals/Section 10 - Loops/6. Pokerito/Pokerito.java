import java.util.Scanner;

/**
 * Pokerito - It's almost Poker!
 *
 * The rules are simple:
 * - The dealer will give you one card and the computer one card.
 * - Then, the dealer will draw five cards (the river).
 * - The player with the most river matches wins. 
 * - If the matches are equal, everyone is a winner!
 */

public class Pokerito {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Explain the rules
        System.out.println("\nLet's play Pokerito. Type anything when you are ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("\t* There are two players, you and the computer.");
        System.out.println("\t* The dealer will give each player one card.");
        System.out.println("\t* Then, the dealer will draw five cards (the river).");
        System.out.println("\t* The player with the most river matches wins!");
        System.out.println("\t* If the matches are equal, everyone's a winner!");
        System.out.println("\nReady? Type anything if you are.");
        scan.nextLine();

        // Present the user with a card
        String userCard = randomCard();
        String computerCard = randomCard();
        System.out.println("Here's your card: \n" + userCard);
        System.out.println("Here's the computer card: \n" + computerCard);

        // Counter for the user's matches and the computer's matches
        int userMatches = 0;
        int computerMatches =0;

        // Draw the five cards
        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");
        String riverCard = " ";
        for(int i=1 ; i<=5 ; i++) {
            scan.nextLine();
            riverCard = randomCard();
            System.out.println("Card " + i + ":");
            System.out.println(riverCard);
            if(userCard.equals(riverCard)) {
                userMatches++;
            }
            if(computerCard.equals(riverCard)) {
                computerMatches++;
            }
        }

        // Determine the winner
        System.out.println("Your number of matches: " + userMatches);
        System.out.println("Computer's number of matches: " + computerMatches);
        if(userMatches == computerMatches) {
            System.out.println("Everyone wins!");
        } else if(userMatches > computerMatches) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        // Close the Scanner
        scan.close();
    }

    /** 
     * randomCard - returns a random card between 1 and 13.
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard() {
        int randomNumber = (int)(Math.random() * 13 + 1);
        switch(randomNumber) {
            case 1: return  "   _____\n"+
                            "  |A _  |\n"+ 
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";
            case 2: return  "   _____\n"+              
                            "  |2    |\n"+ 
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____Z|\n";
            case 3: return  "   _____\n" +
                            "  |3    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____E|\n";
            case 4: return  "   _____\n" +
                            "  |4    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  | o o |\n"+
                            "  |____h|\n";
            case 5: return  "   _____ \n" +
                            "  |5    |\n" +
                            "  | o o |\n" +
                            "  |  o  |\n" +
                            "  | o o |\n" +
                            "  |____S|\n";
            case 6: return  "   _____ \n" +
                            "  |6    |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  |____6|\n";
            case 7: return  "   _____ \n" +
                            "  |7    |\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |____7|\n";
            case 8: return  "   _____ \n" +
                            "  |8    |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  |____8|\n";
            case 9: return  "   _____ \n" +
                            "  |9    |\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |____9|\n";
            case 10: return "   _____ \n" +
                            "  |10  o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |___10|\n";
            case 11: return "   _____\n" +
                            "  |J  ww|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o% |\n"+ 
                            "  | | % |\n"+ 
                            "  |__%%[|\n";
            case 12: return "   _____\n" +
                            "  |Q  ww|\n"+ 
                            "  | o {(|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%O|\n";
            case 13: return "   _____\n" +
                            "  |K  WW|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%>|\n";
            default: return "ERROR: This shouldn't run.";
        }
    }
}
