/**
 * Doc Comments
 */

public class DocComments {
    public static void main(String[] args) {
        
        // Call the greet function
        greet();

        // Call the printText function
        printText("Andre", 24);

        // Call the calculateArea function
        calculateArea(2.5, 4.2);
    }

    
    /**
     * greet - function that greets the user by printing a message.
     * @param none
     * @return none 
     */
    public static void greet() {
        System.out.println("Hello!");
    }

    /**
     * printText - function that prints a message, using name and age as parameters to complete the string.
     * @param name (String)
     * @param age  (int)
     * @return none
     */
    public static void printText(String name, int age) {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    } 

    /**
     * calculateArea - calculates the area of a rectangle based on length and width parameters.
     * @param length (double)
     * @param width  (double)
     * @return double
     */
    public static double calculateArea(double length, double width) {
        return (length * width);
    }
    
}