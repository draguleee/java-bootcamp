/**
 * Doc Comments: describe what a function does
 */

public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * greet - greets the user.
     * @param none
     * @return none
     */
    public static void greet() {
        System.out.println("Hi!");
    }

    /**
     * printText - prints an introduction of the user.
     * @param name   (String)
     * @param age    (int)
     * @return none 
     */
    public static void printText(String name, int age) {
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * calculateArea - calculates the area of a rectangle.
     * @param length (double)
     * @param width  (double)
     * @return double
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
}