import java.util.Scanner;

/**
 * Workbook 5.8 - Guess the number
 * 
 * The user has to keep guessing a number unil they get it right.
 */

public class Guess  {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Store a "secret" number between 1 and 5
        int random = randomNumber();
        System.out.println("I chose a number between 1 and 10.");
        System.out.print("Try to guess it: ");
        int guess = scan.nextInt();

        // Set up a loop that keeps the user guessing until they get the right number
        if (isInBounds(guess)) {
            int attempts = 1;
            while (guess != random) {
                attempts++;
                System.out.print("Try again: ");
                guess = scan.nextInt();
            }
            System.out.println("\nCongratulations!");
            System.out.println("You guessed the number in " + attempts + " tries.");
        } else {
            System.err.println("\nError: Out of bounds!");
            System.exit(0);
        }
       
        // Close the Scanner        
        scan.close();
    }

    /**
     * randomNumber - generates a random number between 1 and 5
     * @return none
     */
    public static int randomNumber() {
        return (int)(Math.random() * 10 + 1);
    }

    /**
     * isInBounds - checks if the entered number is in the [1, 5] interval
     * @param guess (int)
     * @return none
     */
    public static boolean isInBounds(int guess) {
        return ((guess <= 10) && (guess >= 1));
    }

}
