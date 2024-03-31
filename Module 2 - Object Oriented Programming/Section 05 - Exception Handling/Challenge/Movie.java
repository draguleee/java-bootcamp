/**
 * Movie Class
 */

public class Movie {

    // Instance variables (private)
    private String name;
    private String format;
    private double rating;

    // Constructor with parameters
    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    // Copy constructor
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    // Getter for name
    public String getName() { return this.name; }

    // Setter for name
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        } else {
            this.name = name;
        }
    }

    // Getter for format
    public String getFormat() { return this.format; }

    // Setter for format
    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("format cannot be null/blank");
        } else {
            this.format = format;
        }
    }

    // Getter for rating
    public double getRating() { return this.rating; }

    // Setter for rating
    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("invalid rating");
        } else {
            this.rating = rating;
        }
    }

    // toString() method - prints the Object as a String
    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "\n";
    }
    
}
