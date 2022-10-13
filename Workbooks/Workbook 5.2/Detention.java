import java.util.Scanner;

// Workbook 5.2

public class Detention {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Ask Bart what would you like to write for him
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");

        // Pick up Bart's sentence
        String sentence = in.nextLine();

        // Print it 99 times
        for(int i=1 ; i<=99 ; i++) {
            System.out.println(i + ". " + sentence);
        }

        // Close the Scanner
        in.close();
    }
}
