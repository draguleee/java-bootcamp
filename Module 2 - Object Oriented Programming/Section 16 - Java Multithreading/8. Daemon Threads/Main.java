/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {
        
        // Create a MemoryMoniorDaemon thread and start it
        Thread memoryMonitorThread = new Thread(new MemoryMonitorDaemon());
        memoryMonitorThread.setDaemon(true);
        memoryMonitorThread.start();

        // Create a MemoryIntensiveTask thread and start it
        Thread memoryIntensiveTaskThread = new Thread(new MemoryIntensiveTask());
        memoryIntensiveTaskThread.start();
    }
}