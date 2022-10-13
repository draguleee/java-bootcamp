import java.util.Scanner;

// Workbook 5.8

public class Guess {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);
        
        // Store a secret number between 1 and 5
        double random = (Math.random()*5)+1;
        int number = (int)random;

        // Prompt the user to enter a guess
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = in.nextInt();

        // Set up a loop that keeps running while the user is incorrect
        int tries = 0;
        while(number != guess) {
            System.out.print("Wrong! Guess again: ");
            guess = in.nextInt();
            tries++;
        }
        System.out.println("You got it!\nNumber of tries: " + tries);

        // Close the Scanner
        in.close();
    }
    
}
