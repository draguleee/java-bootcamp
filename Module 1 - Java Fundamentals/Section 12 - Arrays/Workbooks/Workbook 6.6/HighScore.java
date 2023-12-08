/**
 * Workbook 6.6 - High Score (Revisited)
 */

public class HighScore {
    public static void main(String[] args) {

        // Create an integer array with 10 elements, determine the high score and the index
        int[] scores = new int[10];
        int highScore = 0;
        int index = 0;
        System.out.println("\nHere are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = randomNumber();
            System.out.println((i+1) + ". " + scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                index = i;
            }
        }

        // Print the results
        System.out.println("\n\nThe highest score is: " + highScore);
        System.out.println("It's the player at COMP: " + (index+1));

    }
    
    /**
     * randomNumber - returns a random number between 0 and 49999.
     * @return none
     */
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
