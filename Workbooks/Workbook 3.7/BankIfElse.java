import java.util.Scanner;

// Workbook 3.7

public class BankIfElse {
    public static void main(String[] args) {
        
        // Create the Scanner
        Scanner in = new Scanner(System.in);

        // Welcome the user and rompt them to choose an option
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String decision = in.nextLine();

        // Choose a scenario based on the input value
        if(decision.equals("yes") || decision.equals("Yes") || decision.equals("YES")) {
            System.out.println("\nGreat! In one line: " +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            double savings = in.nextDouble();
            double debt = in.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int years = in.nextInt();
            in.nextLine();
            System.out.println("\nWhat is your name?");
            String name = in.nextLine();
            if(savings >= 10000 && debt < 5000 && years >= 2) {
                System.out.println("Congratulations <name> You have been approved!");
            }
            else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        }
        else if(decision.equals("no") || decision.equals("No") || decision.equals("NO")) {
            System.out.println("\nOK. Have a nice day!");
        }
        else {
            System.out.println("\nInvalid option.");
        }

        // Close the Scanner
        in.close();
    }
}
