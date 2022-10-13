// Doc Comments

public class DocComments {

    // Main method
    public static void main(String[] args) {
        
    }

    /** 
     * Function name: greet()
     * 
     * @param none
     * @return none
     * 
     * Inside the function:
     * 1. Prints "Hi!";
     */
    public static void greet() {
        System.out.println("Hi!");
    }

    /**
     * Function name: printText()
     * @param name      (String)
     * @param age       (int)
     * 
     * Inside the function:
     * 1. Prints the name and age as part of a text;
     * 
     */
    public static void printText(String name, int age) {
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
    }

    /**
     * Function name: calculateArea()
     * @param length    (double)
     * @param width     (double)
     * @return none     (double)
     * 
     * Inside the function:
     * 1. Calculate the area of the rectangle
     * 2. Return the area
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

}