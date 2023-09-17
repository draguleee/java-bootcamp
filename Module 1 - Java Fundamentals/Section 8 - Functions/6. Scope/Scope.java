/**
 * Scope:
 * - The scope of a variable determines its lifespan.
 * - You can never access a variable outside the scope that it was defined in.
 * 
 * scope: local - defined at the level of the entire function (can be accessible in the function only)
 * scope: global - defined at the level of the entire class (can be accessible everywhere)
 */

public class Scope {
    
    // Global variables to store the rectangle's length and width (accessible within the whole class)
    // static double length = 2;
    // static double width = 4;

    public static void main(String[] args) {

        // Variables length and width of type double
        double length = 2;
        double width = 4;

        // Call the calculateArea function
        calculateArea(length, width);
        calculatePerimeter(length, width);

    }

    /**
     * calculateArea - calculates the area of a rectangle using length andwidth as parameters.
     * @param none
     * @return none
     */
    public static void calculateArea(double param1, double param2) {
        // Local variable to store the area (accessible only within this function)
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    /**
     * calculatePerimeter - calculates the perimeter of a rectangle using length and width as parameters.
     * @param none
     * @return none
     */
    public static void calculatePerimeter(double param1, double param2) {
        // Local variable to store the perimeter (accessible only within this function)
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
