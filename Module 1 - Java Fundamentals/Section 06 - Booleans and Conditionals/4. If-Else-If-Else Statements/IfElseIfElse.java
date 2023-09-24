/**
 * If-Else-IF-Else Statements
 */

public class IfElseIfElse {
    public static void main(String[] args) {

        // Example 1
        String weather = "rainy";
        if(weather.equals("sunny")) {
            System.out.println("It's a nice day for a walk.");
        } else if (weather.equals("rainy")) {
            System.out.println("It rains; bring an umbrella.");
        } else {
            System.out.println("Not sure what to do in this weather.");
        }

        // Example 2
        int score = 85;
        if(score >= 80) {
            System.out.println("You got an A.");
        } else if(score >= 70) {
            System.out.println("You got a B.");
        } else if(score >= 60) {
            System.out.println("Yoy got a C.");
        } else if (score >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed. :(");
        }

        // Example 3
        String jobTitle = "manager";
        if(jobTitle.equals("CEO")) {
            System.out.println("You're the boss!");
        } else if(jobTitle.equals("manager")) {
            System.out.println("You're in charge of a team!");
        } else {
            System.out.println("You're an employee.");
        }

        // Example 4
        char grade = 'B';
        if(grade == 'A') {
            System.out.println("Excellent work!");
        } else if(grade == 'B') {
            System.out.println("Good job!");
        } else if(grade == 'C') {
            System.out.println("You did OK!");
        } else if(grade == 'D') {
            System.out.println("Hey, you still passed!");
        } else {
            System.out.println("You failed. :(");
        }
        
    }
}
