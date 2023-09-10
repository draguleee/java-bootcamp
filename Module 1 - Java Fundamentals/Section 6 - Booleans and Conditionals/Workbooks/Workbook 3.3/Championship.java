/**
 * Workbook 3.3 - The Quidditch Championship
 * 
 * This is a modified passage from the book: Harry Potter and the Half-Blood Prince.
 * If Gryffindor beats Ravenclaw by a margin of 300 points, they win.
 * If they win by any points or tie, they would come in second.
 * If they lose by 100 points or less, they would come in third.
 * If they lose by more than 100 points, they would come in 4th.
 * 
 * We are going to convert this passage into code.
 */

public class Championship {
    public static void main(String[] args) {

        // Number of points scored by Gryffindor and Ravenclaw
        int gryffindor = 400;       // Gryffindor points
        int ravenclaw = 200;        // Ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw; 

        // if-else-if-else
        if(margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if(margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if(margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
        
    }
}
