/**
 * Introducton to Functions
 * 
 * Function: 
 * - Grouping of code that performs a task. 
 * - It is a reusable group of code.
 */

public class Chorus {
    public static void main(String[] args) {
        
        // Call the singChorus() function
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();
    }

    /**
     * singChorus() - sings the chorus of a Michael Jackson song.
     * @param none
     * @return void
     */
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
}