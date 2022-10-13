import java.util.Scanner;

// Workbook 5.3

public class CountingTool {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Choose a number
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int number = in.nextInt();

        // Count from 0 to that number
        for(int i=0 ; i<=number ; i++) {
            System.out.print(i + " ");
        }
    }
}