// Workbook 4.5

public class Calculator {

    /**
     * Function name: main
     * @param args
     */
    public static void main(String[] args) {

        // Welcome the user
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        // Call area functions
        double square = squareArea(2);
        double rectangle = rectangleArea(1, 2);
        double triangle = triangleArea(1, 2);
        double circle = circleArea(2);

        // Print all the areas
        printAreas(square, rectangle, triangle, circle);

    }

    /**
     * Function name: squareArea - returns the area of a square.
     * @param side  (double)
     * @return
     * 
     * Inside the function:
     * 1. If the side is negative, prints "Error: impossible" and terminates the java program.
     * 2. Calculates the area of the square. A = side²
     */
    public static double squareArea(double side) {
        if(side < 0) {
            System.out.println("Error: Impossible.");
            System.exit(0);
        }
        double squareArea = side * side;
        return squareArea;
    }

    /**
     * Function name: rectangleArea - returns the area of a rectangle.
     * @param length    (double)
     * @param width     (double)
     * @return
     * 
     * Inside the function: 
     * 1. If the length OR width is negative, prints "Error: impossible" and terminates the program.
     * 2. Calculates the area of the rectangle. A = length * width
     */
    public static double rectangleArea(double length, double width) {
        if(length < 0 || width < 0) {
            System.out.println("Error: Impossible.");
            System.exit(0);
        }
        double rectangleArea = length * width;
        return rectangleArea;
    }

    /**
     * Function name: triangleArea - returns the area of a triangle.
     * @param base      (double)    
     * @param height    (double)
     * @return
     * 
     * Inside the function:
     * 1. If the base OR height is negative, prints "Error: impossible" and terminates the program.
     * 2. Calculates the area of the triangle. A = (base * height)/2
     */
    public static double triangleArea(double base, double height) {
        if(base < 0 || height < 0) {
            System.out.println("Error: Impossible.");
            System.exit(0);
        }
        double triangleArea = (base * height) / 2;
        return triangleArea;
    }

    /**
     * Function name: circleArea - returns the area of a circle.
     * @param radius    (double)
     * @return
     * 
     * Inside the function:
     * 1. If the radius is negative, prints "Error: impossible" and terminates the program.
     * 2. Calculates the area of the circle. 
     */
    public static double circleArea(double radius) {
        if(radius < 0) {
            System.out.println("Error: Impossible.");
            System.exit(0);
        }
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    /**
     * Function name: printAreas - prints all the calculated areas.
     * @param square        (double)
     * @param rectangle     (double)
     * @param triangle      (double)
     * @param circle        (double)
     * 
     * Inside the function:
     * 1. print: ("Square area: <square area>")
     * 2. print: ("Rectangle area: <rectangle area>")
     * 3. print: ("Triangle area: <triangle area>")
     * 4. print: ("Circle area: <circle area>")
     */
    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }
    
}
