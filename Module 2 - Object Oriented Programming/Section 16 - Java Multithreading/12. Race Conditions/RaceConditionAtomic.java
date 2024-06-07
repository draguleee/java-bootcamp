import java.util.concurrent.atomic.AtomicInteger;

/**
 * RaceConditionAtomic class
 */

public class RaceConditionAtomic {

    // Instance variable (private) - count variable
    public static AtomicInteger count = new AtomicInteger(0);

    // Getter for count
    public static int getCount() {
        return count.get();
    }

    /**
     * increment() - increments the count variable
     */
    public static void increment() {
        count.incrementAndGet();    // Atomic increment, executed as a single step
    }

    
    public static void main(String[] args) throws InterruptedException {

        // Create an incrementTask Runnable that counts up to 1000
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        // Create two Threads with the specified incrementTask Runnable
        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        // Start the threads
        t1.start();
        t2.start();

        // Make the main thread wait for the two child threads
        t1.join();
        t2.join();

        // Print the final count
        System.out.println("Final count: " + getCount());
    
    }
}
