package shape;

/**
 * Shape class - Superclass
 */

public abstract class Shape {
    
    // Instance variables (private)
    private double radius;

    // Constructor for Shape class
    public Shape(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Abstract method for area and volume
    public abstract double getArea();
    public abstract double getVolume();



}