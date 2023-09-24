/**
 * Return Values
 * - Bad Practice: Your function handles the final result.
 * - Good Practice: Your function should return the final result.
 * 
 * The Process:
 * 1. Your function must define a return type.
 * 2. Your function must return a value.
 * 3. The funtion call retains the return value
 * 
 * break vs return keywords:
 * While break would only break the switch statement, return will break the entire function when invoked.
 */

public class ReturnValues {
    public static void main(String[] args) {

        // Calculate the area of three rectangles
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.3);

        // Print the three areas
        printArea(2.3, 3.5, area1);
        printArea(1.6, 2.4, area2);
        printArea(2.6, 4.3, area3);

        // Explain the area in English, French and Spanish
        String english = explainArea("English");
        String french = explainArea("French");
        String spanish = explainArea("Spanish");
        String italian = explainArea("Italian");

        // Print the explanations
        System.out.println("\n" + english);
        System.out.println(french);
        System.out.println(spanish);
        System.out.println(italian);
    }

    /**
     * calculateArea - function to calculate the area of a rectangle
     * @param length
     * @param width
     * @return double
     */
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid dimensions!");
            System.exit(0);     // Terminate the runtime
        }
        double area = length * width;
        return area;
    }

    /**
     * explainArea - function that explains the area formula in different languages
     * @param language
     * @return String
     */
    public static String explainArea(String language) {
        switch(language) {
            case "English" : return "Area equals length * width";
            case "French" : return "La surface est egale a la longueur * la largeur";
            case "Spanish" : return "Area es igual a largo * ancho";
            default : return "Language not available.";
        }
    }

    /**
     * printArea - function that prints the area, along with the length and width used for calculating the area
     * @param length
     * @param width
     * @param area
     * @return none
     */
    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with length of " + length + " and a width of " + width + " has an area of " + area + ".");
    }
    
}