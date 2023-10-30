/**
 * Functions and Parameters:
 * - Functions with parameters expect to receive values
 * - Functions without parameters do not expect to receive values
 * 
 * Parameter: stores a value that your function expects to receive
 * 
 * Argument: value that you pass into a function
 * 
 * 
 * The Process:
 * 
 * 1. Create a function that expecys to receive parameters: double length, doube width.
 * 
 * 2. Call the function by passing in two matching values.
 * 
 * 3. The function uses its parameters to perform a task.
 */

public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.5);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.3);
    }

    public static void calculateArea(double length, double width) {
        System.out.println("Area of the rectangle: " + (length * width));
    }
    
}