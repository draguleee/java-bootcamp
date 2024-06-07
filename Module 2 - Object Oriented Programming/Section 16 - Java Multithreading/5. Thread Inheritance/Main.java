/**
 * Thread Inheritance
 */

public class Main {

    public static void main(String[] args) {

        // Create two AthleteThread objects
        AthleteThread favorite = new AthleteThread(84921, "Marcus Eldridge", Thread.MAX_PRIORITY);
        AthleteThread underdog = new AthleteThread(43114, "Hiroshi Nakamura", Thread.MIN_PRIORITY);
        
        // Starting the threads
        favorite.start();
        underdog.start();
    }
    
}