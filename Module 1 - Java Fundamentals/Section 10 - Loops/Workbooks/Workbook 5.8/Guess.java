import java.util.Scanner;

/** 
 * Workbook 5.8 - Guess the Number 
 * The user has to keep guessing a number until they get it right.
*/

public class Guess  {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Counter variable
        int counter = 1;        

        // Store a secret number between 1 and 5 and prmpt a user to enter a guess
        System.out.print("\nI chose a number between 1 and 5. Try to guess it: ");
        int secretNumber = (int)(Math.random() * 5 + 1);
        int guessNumber = scan.nextInt();

        // Set up a loop that keeps the user guessing until they get it right
        if((guessNumber > 0) && (guessNumber < 6)) {
            while(guessNumber != secretNumber) {
                counter++;
                System.out.print("Guess again: ");
                guessNumber = scan.nextInt();
                if(counter >= 3) {
                    System.out.println("\nYou passed the 5 chances. Sorry...");
                    System.out.println("The number was: " + secretNumber);
                    System.exit(0);
                }           
            }
            System.out.println("\nCongratulations!");
            System.out.println("You guessed the number in " + counter + " tries.");
        } else {
            System.err.println("\nERROR: Number is not in range!");
        }

        // Close the Scanner
        scan.close();
    }

}