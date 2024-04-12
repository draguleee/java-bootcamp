import static java.lang.Math.*;

/**
 * Circle class
 */



public class Circle {

    // Instance variable (private)
    private double radius;

    // Constructor for Circle class
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * getCircumference() - returns the circumference of the circle
     * @return
     */
    public double getCircumference() {
        return 2 * PI * radius;
    }

    /**
     * getArea() - returns the area of the circle
     * @return
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * getLargerRadius() - returns the larger radius of two radiuses
     * @param otherRadius
     * @return
     */
    public double getLargerRadius(double otherRadius) {
        return max(radius, otherRadius);
    }

    /**
     * getSmallerRadius() - returns the smaller radius of two radiuses
     * @param otherRadius
     * @return
     */
    public double getSmallerRadius(double otherRadius) {
        return min(radius, otherRadius);
    }

    /**
     * getRadiusSquared() - returns the radius power 2
     * @return
     */
    public double getRadiusSquared() {
        return pow(radius, 2);
    }

    /**
     * getRadiusSquareeRoot() - returns the square root of the radius
     * @return
     */
    public double getRadiusSquareRoot() {
        return sqrt(radius);
    }

}