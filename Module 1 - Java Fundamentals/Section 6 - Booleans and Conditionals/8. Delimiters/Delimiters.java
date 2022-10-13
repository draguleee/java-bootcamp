import java.util.Scanner;

// Delimiters

public class Delimiters {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Request the user to input 2 int values
        System.out.println("\nEnter two integers (on the same line): ");
        int i1 = in.nextInt();
        int i2 = in.nextInt();

        // Request the user to input 2 long values
        System.out.println("\nEnter two very big integers (on the same line): ");
        long l1 = in.nextLong();
        long l2 = in.nextLong();
        
        // Request the user to input 2 double values
        System.out.println("\nEnter two decimals (on the same line): ");
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        
        // Request the user to input 2 String values 
        System.out.println("\nEnter two text values (on the same line): ");
        String t1 = in.next();
        String t2 = in.next();

        // Request the user to input 2 int values
        System.out.println("\nEnter two integers (on the same line): ");
        String il1 = in.nextLine();
        String il2 = in.nextLine();

        // Request the user to input 2 long values
        System.out.println("\nEnter two very big integers (on the same line): ");
        String ll1 = in.nextLine();
        String ll2 = in.nextLine();
        
        // Request the user to input 2 double values
        System.out.println("\nEnter two decimals (on the same line): ");
        String dl1 = in.nextLine();
        String dl2 = in.nextLine();
        
        // Request the user to input 2 String values 
        System.out.println("\nEnter two text values (on the same line): ");
        String tl1 = in.nextLine();
        String tl2 = in.nextLine();

        // Print the values 
        System.out.println("\n\tIntegers: " + i1 + " " + i2);
        System.out.println("\tLongs: " + l1 + " " + l2);
        System.out.println("\tDoubles: " + d1 + " " + d2);
        System.out.println("\tStringss: " + t1 + " " + t2);

        // Print the values (with nextLine())
        System.out.println("\n\tIntegers: " + il1 + " " + il2);
        System.out.println("\tLongs: " + ll1 + " " + ll2);
        System.out.println("\tDoubles: " + dl1 + " " + dl2);
        System.out.println("\tStringss: " + tl1 + " " + tl2);

        // in.nextLine() trap
        System.out.println("\nPlease enter a number: ");
        int number = in.nextInt();
        in.nextLine();
        System.out.println("\nPlease write a sentence: ");
        String sentence = in.nextLine();
        
        // Close the Scanner
        in.close();
    
    }
}