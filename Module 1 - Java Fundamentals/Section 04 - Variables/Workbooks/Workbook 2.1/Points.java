/**
 * Workbook 2.1 - Points
 * 
 * 
 */

public class Points {
    public static void main(String[] args) {
        
        // Create a points variable of type int that starts at 0
        int points = 0;

        // Update the variable whenever Gryffindor wins or loses points
        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -= 3;
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;   
        
        // Print the final points:
        System.out.println("Final points: " + points);
        
    }
}

