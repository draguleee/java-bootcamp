import java.util.Scanner;

/**
 * Challenge - Blackjack
 * 
 * Blackjack is the most popular table game at casinos.
 * You're going to build a simple version of Blackjack.
 * 
 *   Part 1: Starting the game
 *   In Blackjack, the player plays against the dealer. The dealer 
 * gives the player two ards faceup, and the dealer also starts with 
 * two cards, but only one of the dealer's cards is faceup, the other 
 * one being facedown.
 * 
 *   Part 2: During the game
 *   First, it's the player's turn. The player can decide to hit or 
 * stay (hit: draw another card, stay: do nothing). If the player 
 * decides to hit, and their hand value exceeds 21, they go bust (they
 * lose).
 *   Once the player decides to stay, the dealer reveals the hidden
 * card. Then, the dealer must hit until their cards total up to 17.
 * At 17 points or higher, the dealer must stay.
 * 
 *   Deciding the winner:
 *   - You win if your hand value is higher than the dealer's hand.
 *   - You win if the dealer goes bust (exceeds 21)
 *   - You lose if the dealer's hand value is higher than yours.

 */

public class Blackjack {

    // Create the Scanner
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Present the game to the user
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see...");
        System.out.println("...Ready? Press anything to begin!");
        scan.nextLine();

        // Get two random cards for the user
        int userCardNumber1 = drawRandomCard();
        int userCardNumber2 = drawRandomCard();
        String userCard1 = cardString(userCardNumber1);
        String userCard2 = cardString(userCardNumber2);

        // Print the user's cards and the sum of your hand value
        System.out.println("\nYou get a \n" + userCard1 + "\n and a \n" + userCard2);
        int userHandValue = Math.min(10, userCardNumber1) + Math.min(10, userCardNumber2);
        System.out.println("Your hand value is: " + userHandValue);
        System.out.println("Press Enter to show the dealer's cards...");
        scan.nextLine();

        // Get two random cards for the dealer
        int dealerCardNumber1 = drawRandomCard();
        int dealerCardNumber2 = drawRandomCard();
        String dealerCard1 = cardString(dealerCardNumber1);
        String dealerCard2 = cardString(dealerCardNumber2);

        // Print the dealer's card
        System.out.println("\nThe dealer shows \n" + dealerCard1 + "\n and has a card facing down \n" + faceDown());
        int dealerHandValue = Math.min(10, dealerCardNumber1) + Math.min(10, dealerCardNumber2);
        System.out.println("The dealer's total is hidden.");
        System.out.println("Press Enter to start playing...");
        scan.nextLine();

        // User's turn!
        while(true) {
            String option = hitOrStay();
            if (option.equalsIgnoreCase("stay")) {
                break;
            } else if (option.equalsIgnoreCase("hit")) {
                int newCardNumber = drawRandomCard();
                String newCard = cardString(newCardNumber);
                userHandValue += Math.min(10, newCardNumber);
                System.out.println("\nYou get a \n" + newCard);
                System.out.println("Your new total is " + userHandValue);
                if (userHandValue > 21) {
                    System.out.println("\nBust! Player loses.");
                    System.exit(0);
                }
            }
        }

        // Dealer's turn!
        System.out.println("\nPress Enter to start the dealer's turn...");
        scan.nextLine();
        System.out.println("\nDealer's turn.");
        System.out.println("\nThe dealer's cards are \n" + dealerCard1 + "\n and a \n" + dealerCard2);
        while (dealerHandValue <= 17) {
            int newCardNumber = drawRandomCard();
            String newCard = cardString(newCardNumber);
            dealerHandValue += Math.min(10, newCardNumber);
            System.out.println("\nDealer gets a \n" + newCard);
            System.out.println("\nDealer's new total is " + dealerHandValue);
            if (dealerHandValue > 21) {
                System.out.println("\nBust! Dealer loses.");
                System.exit(0);
            }
        }

        // Display the winner
        System.out.println("\nUser's hand value: " + userHandValue);
        System.out.println("Dealer's hand value: " + dealerHandValue);
        System.out.println(displayResults(userHandValue, dealerHandValue));

        // Close the Scanner
        scan.close();

    }

    /** 
     * drawRandomCard - returns a random integer number between 1 and 13.
     * @param   none
     * @return  (int)
     */
    public static int drawRandomCard() {
        return (int)(Math.random() * 13 + 1);
    }

    /** 
     * cardString - returns a String drawing of the card.
     * @param cardNumber (int)
     * @return           (String)
     */
    public static String cardString(int cardNumber) {
        switch (cardNumber) {
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
            default: return "This should not get called.";
        }
    }

    /**
     * faceDown - prints a card face down.
     * @param   none
     * @return  none
     */
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** 
     * hitOrStay - asks the user to hit or stay.
     * @return (String)
     */
    public static String hitOrStay() {
        System.out.println("\nWould you like to hit or stay?");
        String option = scan.nextLine();
        while (true) {
            if(option.equalsIgnoreCase("hit") || option.equalsIgnoreCase("stay")) {
                break;
            }
            System.out.println("\nPlease write 'hit' or 'stay'.");
            option = scan.nextLine();
        }
        return option;
    }

    /**
     * displayResults - displays the final results and the winner of the game
     * @param userHandValue
     * @param dealerHandValue
     * @return
     */
    public static String displayResults(int userHandValue, int dealerHandValue) {
        if (userHandValue > dealerHandValue && userHandValue <= 21) {
            return "Player wins!";
        } else if (userHandValue < dealerHandValue && dealerHandValue <= 21) {
            return "Dealer wins!";
        } else {
            return "It's a tie!";
        }
    }
}

