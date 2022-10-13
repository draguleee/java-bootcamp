// If-Else & Switch

public class AreaPerimeter {

    // Main method
    public static void main(String[] args) {

        // Calculate the areas
        double area1 = measure(4.3, 2.2, "area");
        double area2 = measure(3.2, 4.1, "perimeter");

        // Print the calculated areas
        stringPrinter(4.3, 2.2, area1, "area");
        stringPrinter(3.2, 4.1, area2, "perimeter");
 
    }

    // Function to calculate the area of a rectangle
    public static double measure(double length, double width, String option) {
        if(length < 0 || width < 0) {
            System.out.println("Length or width cannot be negative!");
            System.exit(0);
        }
        switch(option) {
            case "area" : case "Area" : case "AREA":
                return length * width;
            case "perimeter" : case "Perimeter" : case "PERIMETER":
                return 2 * (length + width);
            default:
                return 0;
        }
    }

    // String printer
    public static void stringPrinter(double length, double width, double measure, String option) {
        System.out.println("The " + option + " of a rectangle with length " + length +
                            " and width " + width + " is: " + measure);
    }
    
}
