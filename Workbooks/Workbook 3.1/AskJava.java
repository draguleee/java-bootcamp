// Workbook 3.1

public class AskJava {
    public static void main(String[] args) {
        
        // Variables
        double change = 3.50;
        double price = 2.50;
        int capacity = 12;
        int people = 15;
        String request = "PS5";
        String purchase = "Toy car";
        int space = 9;
        int guests = 8;
        int yourVotes = 24;
        int competitorVotes = 43;

        // Compare change and price
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");
                                        
        // Compare capacity and people
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (capacity >= people) + "\n");
                                        
        // Compare request and purchase
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (request.equals(purchase)) + "\n");
                                        
        // Compare space and guests
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (space >= guests) + "\n");
                                        
        // Compare votes and competitor
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");
                                    
    }
}