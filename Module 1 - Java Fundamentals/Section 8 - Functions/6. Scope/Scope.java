// Scope

public class Scope {

    static int dogs = 5;             // Exists in the Scope class scope!

    /**
     * Function name: someFunction
     * @param none
     * @return none
     */
    public static void someFunction() {
        // int apples = 5;           // Only exists in the someFunction() scope!
        // System.out.println(apples);
        System.out.println(dogs);
    }

    /**
     * Function name: main
     * @param args
     */
    public static void main(String[] args) {
        // int apples = 5;          // Only exists in the main() scope!
        someFunction();
        System.out.println(dogs);
    }
}