/*
 * Workbook 2.1 - Assignment Operators (+=, -=, /=, *=)
 */

public class Points {
    public static void main(String[] args) {
        
        // Task 1 - a points variable starts at 0
        int points = 0;

        // Task 2 - update the variable whenever Gryffindor wins or loses points
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
        
        // Task 3 - print your final result, it should be 137
        System.out.println(points);
    }
}

