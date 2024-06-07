/**
 * ThreadPriority class (ilustrating setPrority() and yield() methods)
 */

public class ThreadPriority {

    public static void main(String[] args) {

        // Create three Threads that execute the same task (counting)
        Thread t1 = new Thread(() -> count(), "Thread-1");
        Thread t2 = new Thread(() -> count(), "Thread-2");
        Thread t3 = new Thread(() -> count(), "Thread-3");        

        // Set the priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        
        // Start the Threads
        t1.start();
        t2.start();
        t3.start();
    }

    /**
     * count() - count from 0 to 99.
     */
    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " count: " + i);
            if (!Thread.currentThread().getName().equals("Thread-1")) {
                Thread.yield();
            }
        }
    }
}