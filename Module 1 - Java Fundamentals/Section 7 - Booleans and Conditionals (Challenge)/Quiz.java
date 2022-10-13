import java.util.Scanner;

// Trivia Quiz

public class Quiz{
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Question 1
        System.out.println("\n1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
        System.out.print("Answer: ");
        String ans1 = in.nextLine();

        // Question 2
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars");
        System.out.print("Answer: ");
        String ans2 = in.nextLine();

        // Question 3
        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative");
        System.out.print("Answer: ");
        String ans3 = in.nextLine();

        // Question 4
        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        System.out.print("Answer: ");
        String ans4 = in.nextLine();

        // Score variable
        int score = 0;

        // Check each answer - For each correct answer, add 5 points to the score. 
        if(ans1.equals("c")) {
            score += 5;
        }
        if(ans2.equals("a")) {
            score += 5;
        }
        if(ans3.equals("d")) {
            score += 5;
        }
        if(ans4.equals("a") || ans4.equals("b")) {
            score += 5;
        }
        System.out.println("Your final score is: " + score + "/20");

        // Print a message depending on the score
        if(score >= 15) {
            System.out.println("Wow, you know your stuff!");
        }
        else if(score >=5 && score < 15) {
            System.out.println("Not bad!");
        }
        else {
            System.out.println("Better luck next time.");
        }

    }
}