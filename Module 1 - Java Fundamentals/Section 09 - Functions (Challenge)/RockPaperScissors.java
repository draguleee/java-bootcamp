import java.util.Scanner;

/**
 * Challenge - Rock Paper Scissors
 */

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // See if the user wants to play
        System.out.println("\nLet's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.nextLine();

        // Set up the game
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat!");
            System.out.println("Rock - Paper - Scissors, shoot!");
            System.out.print("\nChoose: ");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            printResult(yourChoice, computerChoice, result(yourChoice, computerChoice));
        } else if(answer.equalsIgnoreCase("no")) {
            System.out.println("\nDang. Some other time, then!");
        } else {
            System.out.println("\nHmm...");
        }
              
        // Close the Scanner
        scan.close();
    }

    /**
     * computerChoice - picks randomly between rock paper and scissors
     * @return choice (String)
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int random = (int)(Math.random() * 3);
        switch (random) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "This shouldn't run.";
        }
    }

    /**
     * result - It returns the result of the game
     *  @param yourChoice     (String)
     *  @param computerChoice (String) 
     *  @return result        (String) 
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        boolean isUserWinner = ((yourChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                                (yourChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                                (yourChoice.equals("Scissors") && computerChoice.equals("Paper")));
        boolean isCompWinner = ((yourChoice.equals("Scissors") && computerChoice.equals("Rock")) ||
                                (yourChoice.equals("Rock") && computerChoice.equals("Paper")) ||
                                (yourChoice.equals("Paper") && computerChoice.equals("Scissors")));
        boolean tie = yourChoice.equals(computerChoice);
        if(isUserWinner) {
            System.out.println("\nYou win!");
        } else if(isCompWinner) {
            System.out.println("\nComputer wins!");
        } else if(tie) {
            System.out.println("\nIt's a tie!");
        } else {
            System.out.println("\nInvalid choice!");
        }
        return result;
      }
 
    /**
     * printResult - prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * prints everything:
     * – prints: You chose:            <your choice>
     * – prints: The computer chose:   <computer choice>
     * – prints:                       <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("Your choice: " + yourChoice);
        System.out.println("Computer's choice: " + computerChoice);
    }
}
