import java.util.Random;

/**
 * PlayerThread class (inherits the Thread class)
 */

public class PlayerThread extends Thread {

    // Instance variables (private)
    private int score;
    private Random random = new Random();

    // Constructor for PlayerThread class
    public PlayerThread(int playerNumber) {
        this.score = 0;
        this.setName(Integer.toString(playerNumber));
    }

    // Getter for score
    public int getScore() {
        return this.score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for random
    public Random getRandom() {
        return this.random;
    }

    // Setter for random
    public void setRandom(Random random) {
        this.random = random;
    }

    /**
     * run() - runs the Thread.
     */
    @Override
    public void run() {
        for (int i = 0; i < 300000000; i++) {
            this.setScore(this.getScore() + random.nextInt(10)); // Increment score by up to 10 points
        }
        System.out.println("Player " + this.getName() + " final score: " + this.getScore());
    }

}