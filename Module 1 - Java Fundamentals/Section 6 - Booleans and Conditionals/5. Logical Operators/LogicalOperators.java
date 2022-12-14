// Logical Operators

public class LogicalOperators {
    public static void main(String[] args) {

        // The OR operator
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";
        if(chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations! You got the scholarship.");
        }
        else {
            System.out.println("We are sorry. Try again next year!");
        }

        // The AND operator
        int credits = 56;
        double gpa = 1.5;
        if(credits >= 40 && gpa >= 2.0) {
            System.out.println("You earned your diploma!");
        }
        else {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 2.0!");
        }
        
    }
}