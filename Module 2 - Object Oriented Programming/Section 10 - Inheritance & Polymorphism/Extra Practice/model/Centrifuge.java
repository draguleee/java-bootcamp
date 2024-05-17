package model;

/** 
 * Centrifuge class - Subclass
 */

public class Centrifuge extends LabEquipment {
    
    // Instance variables (private)
    private int maxRpm;

    // Constants
    public static final int MIN_RPM = 500;

    // Constructor for Centrifuge class
    public Centrifuge(String manufacturer, String model, int year, int maxRpm) {
        super(manufacturer, model, year);
        setMaxRpm(maxRpm);
    }

    // Copy constructor
    public Centrifuge(Centrifuge source) {
        super(source);
        setMaxRpm(source.maxRpm);
    }

    // Getter for maxRpm
    public int getMaxRpm() {
        return this.maxRpm;
    }

    // Setter for maxRpm
    public void setMaxRpm(int maxRpm) {
        if (maxRpm < MIN_RPM) {
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM!");
        }
        this.maxRpm = maxRpm;
    } 

    /**
     * performMaintenance() - maintenance for Centrifuge objects
     */
    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber and lubricate the spindle.";
    }

    /**
     * clone() - clones a Centrifuge object
     */
    @Override
    public LabEquipment clone() {
        return new Centrifuge(this);
    } 
}
