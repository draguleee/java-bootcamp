import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Store Class
 */

public class Store {

    // Instance variable (private)
    private List<Movie> movies;

    // Constructor with no parameter
    // Remember that this app prioritizes retrieving / updating data
    // => ArrayList!
    public Store() {
        movies = new ArrayList<>();
    }

    // Getter for movie at a specified index
    public Movie getMovie(int index) {
        return new Movie(movies.get(index));
    }

    // Setter for movie for a specified index
    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    // Method to add a movie in the movies ArrayList
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
        System.out.println("\nMovie '" + movie.getName() + "' added.");
    }

    // toString() method - prints the Store object as a String
    @Override
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}