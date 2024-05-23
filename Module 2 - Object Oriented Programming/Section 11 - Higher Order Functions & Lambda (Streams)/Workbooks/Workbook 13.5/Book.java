/**
 * Book class
 */

public class Book {

    // Instance variables (private)
    private String title;
    private String genre;
    private Integer year;
    private Double price;

    // Constructor for Book class
    public Book(String title, String genre, int year, double price) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    // Getter for title
    public String getTitle() {
        return this.title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for genre
    public String getGenre() {
        return this.genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter for year
    public Integer getYear() {
        return this.year;
    }

    // Setter for year
    public void setYear(Integer year) {
        this.year = year;
    }

    // Getter for price
    public Double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * toString() - prints the Book object as a String
     */
    public String toString() {
        return this.genre + "  " + this.year + "  $" + this.price + "  " + this.title;
    }

}
    