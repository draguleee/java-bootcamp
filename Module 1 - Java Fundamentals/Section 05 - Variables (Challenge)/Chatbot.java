import java.util.Scanner;

/**
 * Challenge - Chatbot
 * 
 * You're going to build an app that carries a simple conversation.
 */

public class Chatbot {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Pick up the name
        System.out.println("\nHello. What is your name?");
        String name = scan.nextLine();
                           
        // Pick up the hometown
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = scan.nextLine();
                        
        // Pick up the age
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = scan.nextInt();

        // Pick up the favourite language
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + ((double)400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        scan.nextLine();    // Throwaway nextLine() to be wasted on empty space
        String language = scan.nextLine();

        // End the conversation
        System.out.println("\n" + language + ", that's great! Nice chatting with you, " + name + ". I have to log off now. See ya!");
        
        // Close scanner
        scan.close();
        
    }
}
