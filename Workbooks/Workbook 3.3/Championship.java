// Workbook 3.3

public class Championship {
    public static void main(String[] args) {

        // Variables
        int gryffindor = 400;    
        int ravenclaw = 200;    
        int margin = gryffindor - ravenclaw;        // Amount of points by which gryffindor scored over ravenclaw;

        // Championship (If-Else statements)
        if(margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        }
        else if(margin < 300) {
            System.out.println("In second place, Gryffindor!");
        }
        else if(margin <= 100) {
            System.out.println("In third place, Gryffindor!");
        }
        else {
            System.out.println("In fourth place, Gryffindor! ");
        }
        // In second place, Gryffindor!

        // Test case no.1
        gryffindor = 850;
        ravenclaw = 500;
        margin = gryffindor - ravenclaw;
        if(margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        }
        else if(margin < 300) {
            System.out.println("In second place, Gryffindor!");
        }
        else if(margin <= 100) {
            System.out.println("In third place, Gryffindor!");
        }
        else {
            System.out.println("In fourth place, Gryffindor! ");
        }
        // Gryffindor takes the house cup!

        // Test case no.2
        gryffindor = 620;
        ravenclaw = 500;
        margin = gryffindor - ravenclaw;
        if(margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        }
        else if(margin < 300) {
            System.out.println("In second place, Gryffindor!");
        }
        else if(margin <= 100) {
            System.out.println("In third place, Gryffindor!");
        }
        else {
            System.out.println("In fourth place, Gryffindor! ");
        }
        // In second place, Gryffindor!

        // Test case no.3
        gryffindor = 450;
        ravenclaw = 500;
        margin = gryffindor - ravenclaw;
        if(margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        }
        else if(margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        }
        else if(margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        }
        else {
            System.out.println("In fourth place, Gryffindor! ");
        }
        // In third place, Gryffindor!

        // Test case no.4
        gryffindor = 100;
        ravenclaw = 500;
        margin = gryffindor - ravenclaw;
        if(margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        }
        else if(margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        }
        else if(margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        }
        else {
            System.out.println("In fourth place, Gryffindor! ");
        }
        // In fourth place, Gryffindor!

    }
}
