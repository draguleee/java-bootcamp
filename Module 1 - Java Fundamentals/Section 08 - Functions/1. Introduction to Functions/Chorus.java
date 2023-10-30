/**
 * Introduction to Functions
 * 
 * Defining a function: 
 * - level of access: public, private, protected, default (no modifier)
 * - keyword (static): call the function from main() method (will be covered in Module 2)
 * - return type: void, int, String etc.
 * 
 * Function: 
 * - Reusable grouping of code that performs a task
 * - Can be used as many times as we want / need to
 */

public class Chorus {
    public static void main(String[] args) {

        // Sing the chorus 5 times
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();
    }

    /**
     * singChorus() - function that sings the chorus from a Michael Jackson song
     * @param none
     * @return none
     */
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
}