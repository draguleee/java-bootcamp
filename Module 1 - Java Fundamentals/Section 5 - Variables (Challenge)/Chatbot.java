import java.util.Scanner;

/**
 * Challenge - Chatbot: Build an app that carries a simple conversation.
 * 
 * 1. Store each answer
 * 2. Be careful of the nextLine() trap
 * 3. Update each reply
 * 4. Run your code
 * 5. Add new lines whenever it's needed
 * 
 */

public class Chatbot {
    public static void main(String[] args) {
        
        // Set up scanner
        Scanner in = new Scanner(System.in);

        // Pick up user's name
        System.out.println("Hello. What is your name?");
        String name = in.next(); 
                           
        // Add new a line before asking next question.
        System.out.println("\nHi " + name + " I'm Javabot. Where are you from?");
        String home = in.next();
                        
        // Add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = in.nextInt();

        // Add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        String languge = in.next();

        // Add new a line here.
        System.out.println("\n" + languge + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        // Close scanner
        in.close();

    }
}
