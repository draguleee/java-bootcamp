package shape;

/**
 * Shape class - Superclass
 */

public class Shape {    

    // Instance variable (private) - will be inherited by the subclasses
    private double radius;   

    // Constructor for Shape class
    public Shape(double radius) {
        this.radius = radius;
    }

    // Getter for shape's radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for shape's radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    

}