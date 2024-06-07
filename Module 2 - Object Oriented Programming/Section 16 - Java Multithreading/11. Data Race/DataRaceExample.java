/**
 * DataRaceExample class (ilustrates how volatile keyword works)
 */

public class DataRaceExample {

    // Flag (volatile because multiple threads use this resource)
    public static volatile boolean flag;

    public static void main(String[] args) throws InterruptedException {

        // Create a writer thread (updates the flag to true)
        Thread writerThread = new Thread(() -> {
            flag = true;
            System.out.println("Flag set to true");
        });

        // Create a reader flag (keeps runing as long as the flag is false)
        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Waiting for flag to become true - might never see the change
            }
            System.out.println("Flag is true");
        });

        readerThread.start();
        Thread.sleep(100); // Simulating some delay
        writerThread.start();

    }
}
