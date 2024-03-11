/**
 * Movie Class
 */

public class Movie {

    // Instance variables (private)
    private String name;
    private String format;
    private double rating;

    // Default constructor
    public Movie() {
        this.name = "Movie";
        this.format = "format";
        this.rating = 10;
    }

    // Constructor with parameters
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    // Copy constructor
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    // Getters
    public String getName() { return this.name; }
    public String getFormat() { return this.format; }
    public double getRating() { return this.rating; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setFormat(String format) { this.format = format; }
    public void setRating(double rating) { this.rating = rating; }

    // toString() method: displays the object as a String
    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";    
    }
}
