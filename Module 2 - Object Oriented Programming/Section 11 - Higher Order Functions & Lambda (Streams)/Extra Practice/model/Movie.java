package model;

/**
 * Movie class
 */

public class Movie {

    // Instance variables (private)
    private String title;
    private String director;
    private String genre;
    private Integer year;
    private Double rating;

    // Constants
    public static final Integer MIN_YEAR = 1888;
    public static final Integer MAX_YEAR = 2024;
    public static final Double MIN_RATING = 0.0;
    public static final Double MAX_RATING = 10.0;

    // Constructor for Movie class
    public Movie(String title, String director, String genre, int year, double rating) {
        setTitle(title);
        setDirector(director);
        setGenre(genre);
        setYear(year);
        setRating(rating);
    }

    // Copy constructor
    public Movie(Movie source) {
        setTitle(source.title);
        setDirector(source.director);
        setGenre(source.genre);
        setYear(source.year);
        setRating(source.rating);
    }

    // Getter for title
    public String getTitle() {
        return this.title;
    }

    // Setter for title
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank!");
        } 
        this.title = title;
    }

    // Getter for director
    public String getDirector() {
        return this.director;
    }

    // Setter for director
    public void setDirector(String director) {
        if (director == null || director.isBlank()) {
            throw new IllegalArgumentException("Director name cannot be null or blank!");
        }
        this.director = director;
    }

    // Getter for genre
    public String getGenre() {
        return this.genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        if (genre == null || genre.isBlank()) {
            throw new IllegalArgumentException("Genre cannot be null or blank!");
        }
        this.genre = genre;
    }

    // Getter for year
    public Integer getYear() {
        return this.year;
    }

    // Setter for year
    public void setYear(Integer year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Year must be in the " + MIN_YEAR + " - " + MAX_YEAR + " interval!");
        }
        this.year = year;
    }

    // Getter for rating
    public Double getRating() {
        return this.rating;
    }

    // Setter for rating
    public void setRating(Double rating) {
        if (rating < MIN_RATING || rating > MAX_RATING) {
            throw new IllegalArgumentException("Rating must be in the " + MIN_RATING + " - " + MAX_RATING + " interval!");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.title + " - " + this.director + " - " + this.genre + " - " + this.year + " - " + this.rating;
    }

}
