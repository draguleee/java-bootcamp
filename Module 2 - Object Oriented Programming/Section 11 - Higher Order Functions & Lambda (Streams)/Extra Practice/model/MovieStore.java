package model;

import java.util.*;

/**
 * MovieStore class
 */

public class MovieStore {

    // Instance variables (private)
    private List<Movie> movies;

    // Constructor for MovieStore class
    public MovieStore() {
        this.movies = new ArrayList<Movie>();
    }

    /**
     * addMovie() - adds a Movie object to the movies list
     * @param movie
     */
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    /**
     * filterByGenre() - filters the Movie objects by their genre
     * @param genre
     * @return
     */
    public List<Movie> filterByGenre(String genre) {
        List<Movie> filteredMovies = movies.stream()
                .filter(movie -> movie.getGenre().equals(genre))
                .toList();
        return filteredMovies;
    }

    /**
     * sortByReleaseYear() - sorts the Movie objects by their release year
     */
    public List<Movie> sortByReleaseYear() {
        List<Movie> sortedMovies = movies.stream()
                .sorted((x, y) -> x.getYear().compareTo(y.getYear()))
                .toList();
        return sortedMovies;
    }

    /**
     * getTopRatedMovies() - returns the top n rated movies in descending order
     * @param n
     * @return
     */
    public List<Movie> getTopRatedMovies(int n) {
        List<Movie> topMovies = movies.stream()
                .sorted((x, y) -> y.getRating().compareTo(x.getRating()))
                .limit(n)
                .toList();
        return topMovies;
    }

}
