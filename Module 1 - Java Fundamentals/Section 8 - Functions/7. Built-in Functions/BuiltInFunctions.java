// Built-in Functions

public class BuiltInFunctions {

    /**
     * Function name: main
     * @param args
     */
    public static void main(String[] args) {
        
        // The System.out.println() function - prints a message
        System.out.println("Hello, Java!");

        // The System.err.println() function - prints an error message
        System.err.println("Error!");

        // The Math.log() function - logarithm
        double log = Math.log(119.6);
        System.out.println("Logarithm of " + 119.6 + " is: " + log);

        // The Math.sin() function - sinus
        double sine = Math.sin(1.2);
        System.out.println("Sinus of " + 1.2 + " is: " + sine);

        // The Math.cos() function - cosinus
        double cos = Math.cos(1.2);
        System.out.println("Cosinus of " + 1.2 + " is: " + cos);

        // The Math.pow() function - power
        double power = Math.pow(2,4);
        System.out.println("2 power 4 is: " + power);

        // The Math.random() function - generates a random number from 0 to 1
        double random = (Math.random() * 10);
        System.out.println("The random value is: " + random);
    }
}