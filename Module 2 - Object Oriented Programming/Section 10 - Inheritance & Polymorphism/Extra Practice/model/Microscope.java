package model;

/**
 * Microscope class - Subclass
 */

public class Microscope extends LabEquipment {
    
    // Instance variables (private)
    private int magnification;

    // Constants
    public static final int MIN_MAGNIFICATION = 1;

    // Constructor for Microscope class
    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    // Copy constructor
    public Microscope(Microscope source) {
        super(source);
        setMagnification(source.magnification);
    }

    // Getter for magnification
    public int getMagnification() {
        return this.magnification;
    }

    // Setter for magnification
    public void setMagnification(int magnification) {
        if (magnification < MIN_MAGNIFICATION) {
            throw new IllegalArgumentException("Magnification must be greater than " + MIN_MAGNIFICATION + "!");
        }
        this.magnification = magnification;
    }
    
    /**
     * performMaintenance() - maintenance for Microscope objects
     */
    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    /**
     * clone() - clones a Microscope object
     */
    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    } 
}
