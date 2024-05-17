package shape;

/**
 * Sphere class - Subclass
 */

public class Sphere extends Shape {

    // Constructor for Sphere class
    public Sphere(double radius) {
        super(radius);
    }

    // Implement the getArea() abstract method from Shape superclass
    @Override
    public double getArea() {
        return (4 / 3) * Math.PI * Math.pow(super.getRadius(), 3);
    }

    // Implement the getVolume() abstract method from Shape superclass
    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(super.getRadius(), 2);
    }

}