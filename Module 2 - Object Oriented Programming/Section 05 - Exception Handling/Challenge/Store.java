import java.util.ArrayList;
import java.util.List;

/**
 * Store Class
 */

public class Store {

    // Instance variables (private)
    private List<Movie> movies;

    // Constructor for Store that initialises the movies ArrayList
    public Store() {
        this.movies = new ArrayList<>();
    }

    // Getter for movie
    public Movie getMovie(int index) {
        return new Movie(movies.get(index));
    }

    // Setter for movie 
    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    /**
     * addMovie() - adds a movie to the movies ArrayList
     * @param movie
     */
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    // toString() - prints the Object as a String
    @Override
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}