// Parameters

public class Parameters {

    // Function to calculate the area of a rectangle
    public static void rectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("\nArea of the rectangle with length " + length +
                            " and width " + width + " is = " + area);
    }

    // Main method
    public static void main(String[] args) {
        rectangleArea(4.3, 2.2);
        rectangleArea(3.2, 4.1);
        rectangleArea(3.5, 1.2);
        rectangleArea(1.6, 5.6);
        rectangleArea(10.1, 0.7);
        rectangleArea(20.2, 5.6);
    }
}