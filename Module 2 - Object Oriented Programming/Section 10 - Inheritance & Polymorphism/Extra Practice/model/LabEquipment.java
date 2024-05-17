package model;

/**
 * LabEquipment abstract class
 * - Used as a general concept
 * - We do not want to create instances (objects) of it.
 * - We want to use it as a base class for more specific lab equipment types
 */

public abstract class LabEquipment {

    // Instance variables (private)
    private String manufacturer;
    private String model;
    private int year;

    // Constants
    private static final int MIN_YEAR = 1950;
    private static final int MAX_YEAR = 2024;

    // Constructor for LabEquipment class
    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    // Copy constructor
    public LabEquipment(LabEquipment source) {
        setManufacturer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }

    // Getter for manufacturer
    public String getManufacturer() {
        return this.manufacturer;
    }

    // Setter for manufacturer
    public void setManufacturer(String manufacturer) {
        if (manufacturer == null || manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank!");
        } 
        this.manufacturer = manufacturer;
    }

    // Getter for model
    public String getModel() {
        return this.model;
    }

    // Setter for model
    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank!");
        }
        this.model = model;
    }

    // Getter for year
    public int getYear() {
        return this.year;
    }

    // Setter for year
    public void setYear(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Year must be in the 1950-2024 interval!");
        }
        this.year = year;
    }

    /**
     * performMaintenance() - abstract function to be implemented by the existing subclasses.
     * Every subclass will implement a different behaviour of this method.
     * @return String
     */
    public abstract String performMaintenance();

    /**
     * clone() - returns a deep copy o the LabEquipment object at the specified index
     */
    public abstract LabEquipment clone();

}