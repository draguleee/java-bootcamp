import java.util.Scanner;

/**
 * Challenge - Trivia Quiz
 * 
 * The quiz will ask multiple choice questions about common trivia. It tracks
 * the user's answers and prints their final score.
 * 
 * The correct answers are:
 * - Question 1: c
 * - Question 2: a
 * - Question 3: d
 * - Question 4: a OR b is correct
 */

public class Quiz {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Ask the first question and store the answer
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        System.out.print("Your answer: ");
        char answer1 = scan.next().charAt(0);

        // Ask the second question and store the answer
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        System.out.print("Your answer: ");
        char answer2 = scan.next().charAt(0);

        // Ask the third question and store the answer
        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        System.out.print("Your answer: ");
        char answer3 = scan.next().charAt(0);

        // Ask the fourth question and store the answer
        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        System.out.print("Your answer: ");
        char answer4 = scan.next().charAt(0);

        // Variable score that adds up by 5 points if the answer is correct
        int score = 0;

        // Check each answer - For each correct answer, add 5 points to the score. 
        if(answer1 == 'c') {
            score += 5;
        }
        if(answer2 == 'a') {
            score += 5;
        }
        if(answer3 == 'd') {
            score += 5;
        }
        if(answer4 == 'a' || answer4 == 'b') {
            score += 5;
        }
        System.out.println("Your final score is: " + score + "/20");

        // Print a message depending on the score
        if(score >= 15) {
            System.out.println("\nWow, you know your stuff!");
        } else if(score >= 5 && score < 15) {
            System.out.println("\nNot bad!");
        } else {
            System.out.println("\nBetter luck next time!");
        }

        // Close the Scanner
        scan.close();

    }
}
