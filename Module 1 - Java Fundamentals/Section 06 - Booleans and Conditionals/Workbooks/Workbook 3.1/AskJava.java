/**
 * Workbook 3.1 - Ask Java!
 * 
 * The application will ask questions, and eac reply must compare to true or false.
 */

public class AskJava {
    public static void main(String[] args) {
  
        // Ask Java, first question
        double change = 3.50;
        double price = 2.50;
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");
                
        // Ask Java, second question
        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (people <= capacity) + "\n");
                                        
        // Ask Java, third question
        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (purchase.equals(request)) + "\n");

        // Ask Java, fourth question
        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (guests <= space) + "\n");
                                        
        // Ask Java, fifth question
        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");

    }
}
