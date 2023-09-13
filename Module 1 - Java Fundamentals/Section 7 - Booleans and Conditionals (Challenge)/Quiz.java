/**
 * Challenge - Trivia Quiz
 * 
 * The quiz will ask multiple-choice questions about common trivia. It
 * tracks theuser's answers and prints their final score.
 * 
 * The correct answers are:
 * - Question 1: c
 * - Question 2: a
 * - Question 3: d
 * - Question 4: a OR b is correct
 * 
 * Update the user's score by 5 points for each correct answer.
 */

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Question 1
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        char one = scan.next().charAt(0);

        // Question 2
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        char two = scan.next().charAt(0);

        // Question 3
        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        char three = scan.next().charAt(0);

        // Question 4
        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        char four = scan.next().charAt(0);

        // score variable for storing the user's score
        int score = 0;


        // Check each answer - For each correct answer, add 5 points to the score. 
        if(one == 'c') {
            score += 5;
        }
        if(two == 'a') {
            score +=5;
        }
        if(three == 'd') {
            score += 5;
        }
        if(four == 'a' || four == 'b') {
            score += 5;
        }

        // Check the final score
        System.out.println("\nYour finalscore is: " + score + "/20");
        if(score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if(score >= 5 && score < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time.");
        }

        // Close the Scanner
        scan.close();

    }
}
