import java.util.Scanner;

/**
 * Main Class
 */

public class Main {    

    // Store object in which we will store the movies from the Movie[] array
    static Store store = new Store();
    
    // Main method
    public static void main(String[] args) {

        // Array with movies
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        // Populate the movie store and print it in the console
        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }
        printStore();
        userInput();

    }

    /**
     * printStore() - prints the movie store.
     * @param none
     * @return none
     */
    public static void printStore() {
        System.out.println("\n********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

    /**
     * userInput() - allows the user to enter an input in the console
     */
    public static void userInput() {
        Scanner scan = new Scanner(System.in);
        String status = "continue";
        while(status.equals("continue")) {

            // Choose an integer (movie's index in the array / store)
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice = scan.nextInt();

            // Store the movie at index choice in a Movie object
            Movie movie = store.getMovie(choice);

            // Choose a double (new movie's rating)
            System.out.print("Set a new rating for " + movie.getName() + ": ");
            double rating = scan.nextDouble();

            // Set the new rating of the chosen movie
            movie.setRating(rating);

            // Update and print the store
            store.setMovie(choice, movie);
            printStore();

            // DO you want to edi another rating? :)
            System.out.print("To edit another rating, type: 'continue': ");
            status = scan.next();
        }
        scan.close();
    }


}
