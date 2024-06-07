/**
 * AthleteThread class
 */

public class AthleteThread extends Thread {

    // Instance variable (private)
    private int bibNumber;

    // Constructor for AthleteThread class
    public AthleteThread(int bibNumber, String name, int priority) {
        this.bibNumber = bibNumber;
        this.setName(name);
        this.setPriority(priority);
    }

    // Getter for BIB number
    public int getBibNumber() {
        return this.bibNumber;
    }

    // Setter for BIB number
    public void setBibNumber(int bibNumber) {
        this.bibNumber = bibNumber;
    }
    
    /**
     * run() - runs the Thread.
     */
    @Override
    public void run() {
        double distanceKM = 10;
        double steps = 0.001;
        for (double i = 0; i <= distanceKM; i += steps) {
            System.out.println("Athlete #" + this.bibNumber + ": " + i);
            if (Math.abs(i - distanceKM) < steps) {
                System.out.println("\nAthlete #" + this.bibNumber + " has finished the race.\n");
                break; 
            }
        }
    
    }
}
