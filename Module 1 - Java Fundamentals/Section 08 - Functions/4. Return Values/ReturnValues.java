/**
 * Return Values
 * 
 * Bad Practice: Your function handles the final result.
 * Good Practice: Your function returns the final result.
 * 
 * The Process:
 * 1. Your function must define a return type.
 * 2. Your function must return a value.
 * 3. The function call retains the return value.
 */

public class ReturnValues {
    public static void main(String[] args) {

        // Calculate the areas using the defined function
        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.3);

        // Print the areas
        printArea(2.3, 3.5, area1);
        printArea(1.6, 2.4, area2);
        printArea(2.6, 4.3, area3);

        // Explain areas in different languages
        System.out.println(explainArea("English"));
        System.out.println(explainArea("French"));
        System.out.println(explainArea("Spanish"));
        System.out.println(explainArea("Italian"));
    }

    /**
     * calculateArea() - calculates the area of a rectangle.
     * @param length
     * @param width
     * @return none
     */
    public static double calculateArea(double length, double width) {
        if(length < 0 || width < 0) {
            System.out.println("Invalid dimensions!");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    /**
     * explainArea - explains the area in a certain language (English, French, Spanish)
     * @param language
     * @return none
     * 
     * break - will only break the switch statement
     * return - will break the entire function when invoked
     */
    public static String explainArea(String language) {
        switch(language) {
            case "English" : case "english" : case "ENGLISH" : return "Area equals length * width";
            case "French" : case "french" : case "FRENCH" : return "La surface est egale a la longueur * la largeur";
            case "Spanish" : case "spanish" : case "SPANISH" : return "Area es igual a largo * ancho";
            default : return "Language not available yet! :)";
        }
    }

    /**
     * printArea() - prints the length and width, along with the resulted area, in a single sentence.
     * @param length
     * @param width
     * @param area
     */
    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area equal to " + area);
    }
}