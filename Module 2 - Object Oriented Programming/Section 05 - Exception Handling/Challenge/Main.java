import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main Class
 */

public class Main {

    // Declare and initialise a static Store objec
    static Store store = new Store();

    public static void main(String[] args) {

        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }


    /**
     * userInput() - allows the user to edit a movie rating
     */
    public static void userInput() {

        // Create the Scanner
        Scanner scanner = new Scanner(System.in);

        // Edit a movie's rating while the status equals continue
        String status = "continue";
        while (status.equals("continue")) {
            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());
    
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }


    /**
     * promptForChoice() - asks the user to choose an integer from 0 to 9.
     * It also treats the errors that might occur accordingly.
     * @param scanner
     * @return
     */
    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            
            // Continue the while loop if the user doesn't enter an integer
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            // Continue the while loop if the user enters an incorrect choice
            int choice = scanner.nextInt();
            if (incorrectChoice(choice)) {
                continue;
            }

            // Return the choice
            return choice;
        }
    }


    /**
     * incorrectChoice() - returns true if the choice goes below 0 or exceeds 9.
     * @param choice
     * @return
     */
    public static boolean incorrectChoice(int choice) {
        if (choice < 0 || choice > 9) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * promptForRating() - asks the user to choose a double from 0 to 9.
     * It also treats the errors that might occur accordingly.
     * @param scanner
     * @param name
     * @return
     */
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            
            // Continue the while loop if the user doesn't enter a double
            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }

            // Continue the while loop if the user enters an incorrect rating
            double rating = scanner.nextDouble();
            if (incorrectRating(rating)) {
                continue;
            }

            // Return the rating
            return rating;
        }
    }


    /**
     * incorrectRating() - returns true if the rating goes below 0 or exceeds 9.
     * @param rating
     * @return
     */
    public static boolean incorrectRating(double rating) {
        if (rating < 0 || rating > 10) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * loadMovies() - loads the movies from the movies.txt file
     * @param fileName
     * @throws FileNotFoundException
     */
    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
    }


    /**
     * printStore() - prints the store with all the movies.
     */
    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
