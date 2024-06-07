/**
 * Thread Creation
 */

public class Main {
    public static void main(String[] args) {

        // Start a new Thread
        Thread childThread = new Thread(() -> count(), "child");
        childThread.start();

        // Count until 99 (main thread)
        count();
    }

    /**
     * count() - function that counts from 0 to 99
     */
    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}