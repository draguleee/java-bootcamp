/**
 * Store Class
 */

public class Store {
    
    // Instance variable (private)
    private Movie[] movies;

    // Constructor without parameters
    public Store() {
        this.movies = new Movie[10];
    }

    // Getter for movie
    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);
    }

    // Setter for movie
    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    // toString() method: displays the object as a String
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }
}
