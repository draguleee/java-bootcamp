import java.util.Scanner;

// Workbook 5.5

public class CounterTool {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Dialogue
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        // Pick a number to count by
        int countBy = in.nextInt();

        // Pick a number to start counting from
        int countFrom = in.nextInt();

        // Pick a number to count to
        int countTo = in.nextInt();

        // Count
        for(int i=countFrom ; i<=countTo ; i+=countBy) {
            System.out.print(i + " ");
        }
    }
}
