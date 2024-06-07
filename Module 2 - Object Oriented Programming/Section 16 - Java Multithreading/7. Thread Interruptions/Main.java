/**
 * Main class
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        // Create an array containing 4 PlayerThread threads
        final int numberOfPlayers = 4;
        PlayerThread[] threads = new PlayerThread[numberOfPlayers];

        // Populate the array with PlayerThread threads and start them
        for (int i = 0; i < numberOfPlayers; i++) {
            threads[i] = new PlayerThread(i + 1);
            threads[i].start();
        }

        // Competition time limit
        Thread.sleep(2000);

        // Interrupt all players after the time limit and wait for all player threads to finish
        for (PlayerThread playerThread : threads) {
            playerThread.interrupt();
            playerThread.join();
        }

        // Determine the player with the highest score
        int winningScore = 0;
        int winner = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            if (threads[i].getScore() > winningScore) {
                winningScore = threads[i].getScore();
                winner = i + 1;
            }
        }

        System.out.println("Player " + winner + " wins with a score of " + winningScore);
    }
}
