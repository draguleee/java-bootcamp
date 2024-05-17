package shape;

/**
 * Cylinder class - Subclass
 */

public class Cylinder extends Shape {

    // Instance variables (private)
    private double height;

    // Constructor for Cylinder class
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter for cylinder's height
    public double getHeight() {
        return this.height;
    }

    // Setter for cylinder's height
    public void setHeight(double height) {
        this.height = height;
    }
  
}
  