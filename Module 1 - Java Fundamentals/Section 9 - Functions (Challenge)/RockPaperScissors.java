import java.util.Scanner;

// Rock Paper Scissors Game

public class RockPaperScissors {

    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Prompt the user to pick an option
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        // See if the user wants to play
        String answer = in.nextLine();
        if(answer.equals("yes") || answer.equals("YES") || answer.equals("Yes")) {
            System.out.println("Great!\n");
            System.out.println("Rock-Paper-Scissors, shoot!\n");
            String yourChoice = in.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        }
        else {
            System.out.println("Damn... Some other time!");
        }

        // Close the Scanner
        in.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock, paper and scissors.
     * @return choice (String)
     * 
     * Inside the function:
     * 1. Picks a random number between 0 and 2.
     * 2. if 0: returns the choice 'rock'
     *    if 1: returns the choice 'paper'
     *    if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        double random = Math.random() * 3;
        int choice = (int)random;
        switch(choice) {
            case 0: return "Rock"; 
            case 1: return "Paper"; 
            case 2: return "Scissors"; 
            default: return "";
        }
    }

    /**
     * Function name: result - returns the result of the game.
     * @param yourChoice
     * @param computerChoice
     * @return
     * 
     * Inside the function:
     * 
     * 1. result is "You win" if:
     *    You: "rock"      Computer: "scissors"
     *    You: "paper"     Computer: "rock"
     *    You: "scissors"  Computer: "paper"
     * 
     * 2. result is "You lose" if:
     *    Computer: "rock"      You: "scissors"
     *    Computer: "paper"     You: "rock"
     *    Computer: "scissors"  You: "paper"
     * 
     * 3. result is "It's a tie" if:
     *    Your choice equals computer choice.
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if((yourChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (yourChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (yourChoice.equals("Scissors") && yourChoice.equals("Paper"))) {
            result = "You win!";
        }
        else if((yourChoice.equals("Scissors") && computerChoice.equals("Rock")) ||
            (yourChoice.equals("Rock") && computerChoice.equals("Paper")) ||
            (yourChoice.equals("Paper") && yourChoice.equals("Scissors"))) {
            result = "You lose!";
        } 
        else {
            result = "It's a tie!";
        }
        return result;
    }

    /**
     * Function name: printResult - prints everything (your choice, computer's choice and the result)
     * @param yourChoice
     * @param computerChoice
     * @param result
     * 
     * Inside the function:
     * 1. prints everything:
     *    – prints: You chose:          <your choice>
     *    – prints: The computer chose: <computer choice>
     *    – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("Computer chose: " + computerChoice);
        System.out.println("Result: " + result);
    }
    
}
