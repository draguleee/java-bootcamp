import java.util.Scanner;

// Challenge - Chatbot

public class Chatbot {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Request name
        System.out.println("Hello. What is your name?");
        String name = in.nextLine();
                           
        // Request country
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String country = in.nextLine();
                        
        // Request age
        System.out.println("\nI hear it's beautiful at " + country + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        int age = in.nextInt();
        in.nextLine();

        // Request language
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String language = in.nextLine();

        // Log off!
        System.out.println("\n" + language + ", that's great! Nice chatting with you, " + name + ". I have to log off now. See ya!");
        
        // Close the Scanner
        in.close();

    }
}