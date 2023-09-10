/**
 * Workbook 3.1 - AskJava
 * 
 * AskJava! The application will ask questions, and each reply must compare to true or false.
 * 
 * */

public class AskJava {
    public static void main(String[] args) {

        // Compare change and price variables to see if there is enough change to buy chips
        double change = 3.50;
        double price = 2.50;
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");
          
        // Compare capacity and people variables to see if the elevator can hold everyone
        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (people <= capacity) + "\n");

        // Compare request and purchase variables to see if the frfiend will be happy
        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + purchase.equals(request) + "\n");

        // Compare space and guests variables to see if everyone can attend the dinner
        // Don't use == ! This compares the internal references, NOT the values!
        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (guests <= space) + "\n");

        // Compare yourVotes and competitorVotes variables to see if I can win the election
        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");

    }
    
}
