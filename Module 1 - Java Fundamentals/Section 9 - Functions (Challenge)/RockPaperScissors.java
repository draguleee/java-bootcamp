import java.util.Scanner;

/**
 * Challenge - Rock Paper Scissors
 */

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // See if the user wants to play
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.nextLine();

        // Set up the game
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat!");
            System.out.println("Rock - Paper - Scissors, shoot!");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            printResult(yourChoice, computerChoice, result(yourChoice, computerChoice));
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("\nDarn, some other time...!");
        } else {
            System.out.println("\nInvalid answer!");
        }

        // Close the Scanner
        scan.close();
    }


    /**
     * computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int number = (int)(Math.random() * 3);
        switch (number) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "error: please check this bug out.";
        }
    }


    /**
     * result - It returns the result of the game.
     * @param yourChoice (String)
     * @param computerChoice (String) 
     * @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     *
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "Computer wins!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "Computer wins!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "Computer wins!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            result = "Invalid choice!";
        }
        return result;
      }
 

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * – prints: You chose:          <your choice>
     * – prints: The computer chose: <computer choice>
     * – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\tYou chose: " + yourChoice);
        System.out.println("\tThe computer chose: " + computerChoice);
        System.out.println("\tFinal Result: " + result);
    }

}
