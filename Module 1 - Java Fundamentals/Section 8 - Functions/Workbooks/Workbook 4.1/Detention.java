/**
 * Workbook 4.1 - Detention
 * 
 * Bart's teacher wants him to write lines on the chalkboard.
 * 
 * He needs to write this paragraph 6 times:
 * I will not copy and paste code.
 * I will use Camel Case when writing class names.
 * I will use lower Camel Case when writing function names.
 * I will use lower Camel Case when writing variables names.

 */

public class Detention {
    public static void main(String[] args) {

        // Task 2 - Call the function 6 times
        printLines();
        printLines();
        printLines();
        printLines();
        printLines();
        printLines();
        
   }

    // Task 1 - Write a function
    /**
     * printLines() - prints the lines Bart has to write on the chalkboard.
     * @param none
     * @return void
     * 
     * Inside the function: print the four lines
     */
    public static void printLines() {
        System.out.println("I will not copy and paste code.");
        System.out.println("I will use Camel Case when writing class names.");
        System.out.println("I will use lower Camel Case when writing function names.");
        System.out.println("I will use lower Camel Case when writing variables names.\n");

    }

}
