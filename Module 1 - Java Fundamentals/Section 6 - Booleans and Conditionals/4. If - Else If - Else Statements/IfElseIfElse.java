// If - Else If - Else Statement

public class IfElseIfElse {
    public static void main(String[] args) {

        // Variable
        int grade = 65;
        
        // If- Else If - Else statement
        if(grade >= 80) {
            System.out.println("You got an A.");
        }
        else if(grade >= 70) {
            System.out.println("You got a B.");
        }
        else if(grade >= 60) {
            System.out.println("You got a C.");
        }
        else if(grade>= 50) {
            System.out.println("You got a D.");
        }
        else {
            System.out.println("You failed...");
        }
    }
}