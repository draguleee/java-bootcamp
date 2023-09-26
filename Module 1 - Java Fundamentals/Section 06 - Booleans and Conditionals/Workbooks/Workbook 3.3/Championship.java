/**
 * Workbook 3.3 - Championship
 * 
 * The Quidditch Championship
 * 
 * This is a modified passage from the book: Harry Potter and the 
 * Half-Blood Prince:
 * - If Gryffindor beats Ravenclaw by a margin of 300 points, they win the chapionship.
 * - If they win by any points or tie, they would come in second.
 * - If they lose by 100 points or less, they would come inn third.
 * - If they lose by more than 100 points, they would come in 4th.
 */

public class Championship {
    public static void main(String[] args) {

        // Variables for Gryffindor and Ravenclaw poins
        int gryffindor = 100;    
        int ravenclaw = 500;    

        // Calculate the margin (the amount of points by which Gryffindor scored over Ravenclaw)
        int margin = gryffindor - ravenclaw;

        // Determine the winner (if-else-if-else)
        if(margin >= 300) {
            System.out.println("\nGryffindor takes the house cup!");
        } else if(margin >= 0) {
            System.out.println("\nIn second place, Gryffindor!");
        } else if(margin >= -100) {
            System.out.println("\nIn third place, Gryffindor!");
        } else {
            System.out.println("\nIn fouth place, Gryffindor!");
        }
    }
}
