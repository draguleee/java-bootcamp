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

    // Getter for height
    public double getHeight() {
        return this.height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Implement the getArea() abstract method from Shape superclass
    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(super.getRadius(), 2) + 2 * Math.PI * super.getRadius() * this.height;
    }

    // Implement the getVolume() abstract method from Shape superclass
    @Override
    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
    }
  
}
  