/** 
 * Debugging
 * 
 * Bug: flaw in the code that causes it to produce incorrect results
 * 
 * Process of debugging:
 * 1. Write your code.
 * 2. Place the breakpoints.
 * 3. Click on "Debug".
 * 4. Observe the variables in the left part of the IDE andhow they change after the execution of code.
 * 5. Debugger options:
 *    - Continue: executes the current line of code, then jumps to the next breakpoint.
 *    - Step over: 
 */

public class Debugging {

    public static void main(String[] args) {

        /************** Debugging **************/

        // Variables storing double values
        double exam1Score = 85;
        double exam2Score = 90;
        double exam3Score = 95;

        // The total score, stored in an int vriable
        int total = 100;

        // Variales storing the double values (decimalScore)
        double decimalScore1 = exam1Score / total; 
        double decimalScore2 = exam2Score / total; 
        double decimalScore3 = exam3Score / total; 

        // The average score, stored in an double variable
        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;

        // Print the decimal average
        System.out.println("The decimal average is: " + decimalAverage);

    }
}
