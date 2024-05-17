import shape.Cylinder;
import shape.Shape;
import shape.Sphere;

/**
 * Main class
 */

public class Main {
    public static void main(String[] args) {

        // Create two objects: Cylinder object and Sphere object
        Cylinder cylinder = new Cylinder(1.0, 2.0);
        Sphere sphere = new Sphere(1.0);

        // Print the measures of the cylinder and sphere
        printMeasures(cylinder);
        printMeasures(sphere);
    }
    
    /**
     * printMeasures() - prints the area and volume for every Shape object
     * @param shape
     */
    public static void printMeasures(Shape shape) {

        // Print the Shape type (Cylinder or Sphere)
        System.out.println("\n" + shape.getClass().getSimpleName());

        // Calculate the area and volume of the Shape object
        double area = shape.getArea();
        double volume = shape.getVolume();
        
        // Print the area and volume for the Shape object
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }


}
  