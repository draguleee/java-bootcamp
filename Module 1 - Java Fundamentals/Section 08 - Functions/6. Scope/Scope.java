/**
 * Scope:
 * - The scope of a variable determines its lifespan
 * - You can never access a variable outside the scope that was defined in
 * - Always try to use local variables instead of global variables to not lose track on what's going on in your app
 */

public class Scope {
    
    // Global variables to store the rectangle's length and width (accessible within the whole class)
    // static double length = 2;
    // static double width = 4;

    public static void main(String[] args) {

        // Dimensions of a rectangle (length and width)
        double length = 2;
        double width = 4;

        // Calculate the area and perimeter of the rectangle
        calculateArea(length, width);
        calculatePerimeter(length, width);

    }

    /**
     * calculateArea - calculates the area of a rectangle.
     * @param param1 (double)
     * @param param2 (double)
     * @return none
     */
    public static void calculateArea(double param1, double param2) {
        // Local variable to store the area (accessible only within this function)
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    /**
     * calculatePerimeter - calculates the perimeter of a rectangle.
     * @param param1 (double)
     * @param param2 (double)
     * @return none
     */
    public static void calculatePerimeter(double param1, double param2) {
        // Local variable to store the perimeter (accessible only within this function)
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
