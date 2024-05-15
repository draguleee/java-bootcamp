package model;

import constants.BodyType;
import static constants.ProductionYear.*;
import static constants.Price.*;


/** 
 * Car class
 */

public class Car {

    // Instance variables (private)
    private String make;
    private String model;
    private BodyType bodyType;    // Should this realy be a String?
    private int productionYear;
    private double price;

    // Constructor for Car class
    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    // Copy constructor
    public Car(Car source) {
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
    }

    // Getter for make
    public String getMake() {
        return this.make;
    }

    // Setter for make
    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null or blank!");
        }
        this.make = make;
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

    // Getter for body type
    public BodyType getBodyType() {
        return this.bodyType;
    }

    // Setter for body type
    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("Body type cannot be null!");
        }
        this.bodyType = bodyType;
    }

    // Getter for production year
    public int getProductionYear() {
        return this.productionYear;
    }

    // Setter for production year
    public void setProductionYear(int productionYear) {
        if (productionYear < MIN_YEAR || productionYear > MAX_YEAR) {
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year!");
        }
        this.productionYear = productionYear;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("Price must be in 0 - 200.000 range!");
        }
        this.price = price;
    }

    /**
     * toString() - returns the Car object as a String
     */
    public String toString() {
        return "Make: " + this.make + 
                "\nModel: " + this.model + 
                "\nBody type: " + this.bodyType + 
                "\nProduction year: " + this.productionYear + 
                "\nPrice: " + this.price;
    }
}