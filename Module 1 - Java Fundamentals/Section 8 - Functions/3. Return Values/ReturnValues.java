// Return Value

public class ReturnValues {

    // Function to calculate the area of a rectangle
    public static double rectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    // Main method
    public static void main(String[] args) {

        // Calculate the areas
        double area1 = rectangleArea(4.3, 2.2);
        double area2 = rectangleArea(3.2, 4.1);
        double area3 = rectangleArea(3.5, 1.2);
        double area4 = rectangleArea(1.6, 5.6);
        double area5 = rectangleArea(10.1, 0.7);
        double area6 = rectangleArea(20.2, 5.6);

        // Print the calculated areas
        stringPrinter(4.3, 2.2, area1);
        stringPrinter(3.2, 4.1, area1);
        stringPrinter(3.5, 1.2, area1);
        stringPrinter(1.6, 5.6, area1);
        stringPrinter(10.1, 0.7, area1);
        stringPrinter(20.2, 5.6, area1);
 
    }

    // String printer
    public static void stringPrinter(double length, double width, double area) {
        System.out.println("Area of a rectangle with length " + length +
                            " and width " + width + " is: " + area);
    }

}