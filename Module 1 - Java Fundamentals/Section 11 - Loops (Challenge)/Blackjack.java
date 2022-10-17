// Blackjack

import java.util.Scanner;

public class Blackjack {

    // Create the Scanner
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Welcome the user
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("...Ready? Press anything to begin!");
        in.nextLine();

        // Get two random cards
        int randomCard1 = drawRandomCard();
        int randomCard2 = drawRandomCard();

        // Convert the cards into Strings
        String card1 = cardString(randomCard1);
        String card2 = cardString(randomCard2);
        System.out.println("You get a \n" + card1 + "\n and a \n" + card2);

        // Print the sum of your hand value
        int total = Math.min(randomCard1,10) + Math.min(randomCard2, 10);
        System.out.println("Your total is: " + total);

        // Get two random cards for the dealer
        int randomDealerCard1 = drawRandomCard();
        int randomDealerCard2 = drawRandomCard();

        // Convert the dealer cards into Strings
        String dealerCard1 = cardString(randomDealerCard1);
        String dealerCard2 = cardString(randomDealerCard2);
        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + faceDown());
        
        // Get the sum of the dealer's hand value
        int dealerTotal = Math.min(randomDealerCard1,10) + Math.min(randomDealerCard2, 10);
        System.out.println("The dealer's total is hidden.");

        // Keep asking the player to hit or stay (while loop)
        while(true) {
            String option = hitOrStay();
            int hitCard = drawRandomCard();
            total += Math.min(hitCard, 10);
            String card = cardString(hitCard);
            System.out.println("\nYou get a \n" + card);
            System.out.println("Your new total is: " + total);
            if(option.equals("stay")) {
                break;
            }
            if(total > 21) {
                System.out.println("Bust! Player loses.");
                System.exit(0);
            }
        }

        // Dealer's turn
        System.out.println("\nDealer's turn.");
        System.out.println("\nThe dealer's cards are \n" + dealerCard1 + "\n and a \n" + dealerCard2);
        while(dealerTotal < 17) {
            int dealerHitCard = drawRandomCard();
            dealerTotal += Math.min(dealerHitCard, 10);
            String dealerCard = cardString(dealerHitCard);
            System.out.println("\nDealer gets a \n" + dealerCard);
            System.out.println("\nDealer's total is " + dealerTotal);
        }
        if(dealerTotal > 21) {
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
        }

        // Compare the dealer's and player's hand values.
        if(total > dealerTotal) {
            System.out.println("Player wins!");
        }
        else {
            System.out.println("Dealer wins!");
        }

        // Close the Scanner
        in.close();
    }

    /**
     * Function name: drawRandomCard - returns a random card from 1 to 13.
     * @return (int)
     * 
     * Inside the function:
     * 1. Get a random number between 1 and 13.
     * 2. Returns a card based on the number.
     */
    public static int drawRandomCard() {
        double random = (Math.random()*13)+1;
        int number = (int)random;
        return number;
    }

    /**
     * Function name: cardString - returns the String drawing of the card.
     * @param cardNumber
     * @return (String)
     * 
     * Inside the function:
     * 1. Return a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
        switch(cardNumber) {
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
            default: return "Not possible!";
        }
    }

    /**
     * Function name: faceDown() - returns a card face down
     * @return (String)
     * 
     * Inside the function:
     * 1. Return a card face down
     */
    public static String faceDown() {
        return  "   _____\n"+
                "  |     |\n"+ 
                "  |  J  |\n"+
                "  | JJJ |\n"+
                "  |  J  |\n"+
                "  |_____|\n";
    }

    /**
     * Function name: hitOrStay - asks the user to hit or stay
     * @return (String)
     * 
     * Inside the function:
     * 1. Ask the user to hit or stay.
     * 2. If the user doesn't enter "hit" or "stay", keep asking them to try again by
     *    printing: "Please write 'hit' or 'stay'."
     * 3. Returns the user's option.
     */
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String option = in.nextLine();
        while(!(option.equals("hit") || option.equals("stay"))) {
            System.out.println("Please write 'hit' or 'stay'.");
            option = in.nextLine();
        }
        return option;
    }
    
}
