import java.util.Scanner;

// Pokerito

public class Pokerito {

    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Explain the rules
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        in.nextLine();
        System.out.println("- There are two players, you and the computer.\n" + 
                            "- The dealer will give each player one card.\n" + 
                            "- Then, the dealer will draw five cards (the river).\n" + 
                            "- The player with the most river matches wins!\n" + 
                            "- If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");
        in.nextLine();

        // Present the user with a card
        String yourCard = randomCard();
        System.out.println("Here is your card:\n" + yourCard);
        String computerCard = randomCard();
        System.out.println("\nHere's the computer's card:\n" + computerCard);

        // Numbers of your matches and the computer's matches
        int yourMatches = 0;
        int computerMatches = 0;

        // Draw five cards
        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");
        for(int i=1 ; i<=10 ; i++) {
            in.nextLine();
            String draw = randomCard();
            if(yourCard.equals(draw)) {
                yourMatches++;
            }
            if(computerCard.equals(draw)) {
                computerMatches++;
            }
            System.out.println("Card " + i + ":");
            System.out.println(draw);
        }

        // Get the winner
        System.out.println("\nYour number of matches: " + yourMatches);
        System.out.println("Computer's matches: " + computerMatches);
        if(yourMatches > computerMatches) {
            System.out.println("You win!");
        }
        else if(yourMatches < computerMatches) {
            System.out.println("Computer wins!");
        }
        else {
            System.out.println("It's a tie!");
        }


        // Close the Scanner
        in.close();
    }

    /**
     * Function name: randomCard - returns a random card from 1 to 13.
     * @return (String)
     */
    public static String randomCard() {
        double random = (Math.random()*13)+1;
        int card = (int)random;
        switch(card) {
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
            default: return " ";
        }
    }
    
}
