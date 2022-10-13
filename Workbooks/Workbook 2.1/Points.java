// Workbook 2.1

public class Points {
    public static void main(String[] args) {

        // Points variable for Gryffindor
        int points = 0;

        // Gryffindor loses 50 points
        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points -= 50;

        // Gryffindor loses 3 points
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -= 3;

        // Gryffindor wins 30 points
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;

        // Gryffindor wins 100 points
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;

        // Gryffindor wins 60 points
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;

        // Print the variable
        System.out.println("Points = " + points);
    }
}