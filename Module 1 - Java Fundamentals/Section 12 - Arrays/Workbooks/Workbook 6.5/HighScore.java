/** 
 * Workbook 6.5 - High Score
 */

public class HighScore {
    public static void main(String[] args) {
        
        // Create an array that stores 10 random numbers
        int[] scores = new int[10];
        System.out.println("\nHere are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = randomNumber();
            System.out.print(scores[i] + " ");
        }

        // Determine the highest score among the list
        int highScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        System.out.println("\nHigh Score: " + highScore);
    }   

    /**
     * randomNumber - returns a random number between 0 and 49999.
     * @return none
     */
    public static int randomNumber() {
        return (int)(Math.random() * 50000);
    }

}
