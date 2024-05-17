import shape.*;

/**
 * Main class
 */

public class Main {

    public static void main(String[] args) {
        
        // Create a Cylinder and a Sphere object
        Cylinder cylinder = new Cylinder(1.0, 2.0);
        Sphere sphere = new Sphere(1.0);

        // Print the cylinder
        System.out.println("Cylinder: radius = " + cylinder.getRadius() + "; height = " + cylinder.getHeight());
        System.out.println("Sphere: radius = " + sphere.getRadius());

    }

}
  