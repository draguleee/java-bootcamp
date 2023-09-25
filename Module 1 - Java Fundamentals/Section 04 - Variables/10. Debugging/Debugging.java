/**
 * Debugging
 * 
 Bug: flaw in your code that causes it to produce incorrect results
 */

public class Debugging {

    public static void main(String[] args) {

        /************** Debugging **************/

        // Variables for exam scores of type int
        int exam1Score = 85;
        int exam2Score = 90;
        int exam3Score = 95;

        // The maximum score stored in an int variable
        int total = 100;

        // Calculate the decimal score
        double decimalScore1 = (double)exam1Score / total; 
        double decimalScore2 = (double)exam2Score / total; 
        double decimalScore3 = (double)exam3Score / total; 

        // Calculate the decimal average
        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;

        // Print the decimal average
        System.out.println("The decimal average is: " + decimalAverage);

    }
}
