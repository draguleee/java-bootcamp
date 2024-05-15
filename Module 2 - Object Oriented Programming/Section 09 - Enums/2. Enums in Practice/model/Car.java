package model;

/**
 * Car class
 */

public class Car {

    // Instance variables (private)
    private String make;
    private int year;
    public enum TrafficLight { RED, GREEN, YELLOW }

    // Constructor for Car class
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return this.make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for year
    public int getYear() {
        return this.year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * drive() - function thga
     * @param trafficLight
     */
    public void drive(TrafficLight trafficLight) {
        if (trafficLight == null) {
            throw new IllegalArgumentException("Traffic light cannot be null!");
        }
        switch (trafficLight) {
            case RED: System.out.println("STOP"); break;
            case GREEN: System.out.println("DRIVE"); break;
            case YELLOW: System.out.println("SLOW DOWN"); break;
        }
    }
    
}
