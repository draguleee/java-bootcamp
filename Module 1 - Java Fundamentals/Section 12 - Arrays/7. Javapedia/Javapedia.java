import java.util.Scanner;

/**
 * Javapedia
 */

public class Javapedia {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // Ask the user how many historical figures they will store
        // The number will be stored in an integer variable
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        System.out.print("Enter: ");
        int n = scan.nextInt();
        scan.nextLine();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        String[][] database = new String[n][3];

        // Populate the database
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t- Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t- Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t- Occupation: ");
            database[i][2] = scan.nextLine();
        }

        // Print the database (2D array) with the print2DArray() function.
        System.out.println("\nThese are the values you stored:"); 
        print2DArray(database);
        System.out.println("\nPress Enter to continue...");
        scan.nextLine();

        // Search the database by name
        System.out.println("\nWho do you want information on? ");  
        System.out.print("Enter: ");
        String name = scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            if(name.equals(database[i][0])) {
                System.out.println("\t- Name: " + database[i][0]);
                System.out.println("\t- Date of birth: " + database[i][1]);
                System.out.println("\t- Occupation: " + database[i][2]);
            }
        }
               

        // Close the Scanner
        scan.close();
    }

    /**
     * print2DArray - prints the contents of a 2D array
     * @param array (String[][])
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
    }

}
