/**
 * Book Class
 */

public class Book {

    // Instance variables (private)
    private String title;
    private String author;
    private double rating;
    private double price;

    // Constructor with parameters
    public Book(String title, String author, double rating, double price) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }

    // Copy constructor
    public Book(Book source) {
        this.title = source.title;
        this.author = source.author;
        this.rating = source.rating;
        this.price = source.price;
    }

    // Getters
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public double getRating() { return this.rating; }
    public double getPrice() { return this.price; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setRating(double rating) { this.rating = rating; }
    public void setPrice(double price) { this.price = price; }

}
