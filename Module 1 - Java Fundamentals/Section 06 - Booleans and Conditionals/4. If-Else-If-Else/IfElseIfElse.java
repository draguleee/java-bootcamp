/**
 * If-Else-If-Else
 */

public class IfElseIfElse {
    public static void main(String[] args) {

        // Example 1 - Weather station
        String weather = "rainy";
        if(weather.equals("sunny")) {
            System.out.println("\nIt's a nice day for a walk.");
        } else if(weather.equals("rainy")) {
            System.out.println("\nBring an umbrella.");
        } else {
            System.out.println("\nNot sure what to do in this weather.");
        } 

        // Example 2 - Exam grading (int)
        int score = 85;
        if(score >= 80) {
            System.out.println("\nYou got an A!");
        } else if(score >= 70) {
            System.out.println("\nYou got a B!");
        } else if(score >= 60) {
            System.out.println("\nYou got a C!");
        } else if (score >= 50) {
            System.out.println("\nYou got a D");
        } else {
            System.out.println("\nYou failed. Better luck next time!");
        }

        // Example 3 - Establish job title
        String jobTitle = "manager";
        if(jobTitle.equals("CEO")) {
            System.out.println("\nYou're the boss!");
        } else if(jobTitle.equals("manager")) {
            System.out.println("\nYou're in charge of the team.");
        } else {
            System.out.println("\nYou're an employee...");
        };

        // Example 4 - Exam grading (char)
        char grade = 'B';
        if(grade == 'A') {
            System.out.println("\nExcellent work!");
        } else if(grade == 'B') {
            System.out.println("\nGood job!");
        } else if(grade == 'C') {
            System.out.println("\nYou did OK!");
        } else if(grade == 'D') {
            System.out.println("\nHey, you still passed!");
        } else {
            System.out.println("\nYou failed. Better luck next time!");
        }        
    }
}
