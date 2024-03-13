import java.util.ArrayList;
import java.util.Objects;

/**
 * Store Class
 */

public class Store {
    
    // Instance variables (private)
    private ArrayList<Book> books;

    // Constructor that initializes the empty ArrayList
    public Store() {
        this.books = new ArrayList<>();
    }

    // Getter for book
    public Book getBook(int index) {
        return new Book(this.books.get(index));
    }

    // Setter for book
    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    /**
     * addBook() - adds a book in the books ArrayList.
     * @param book
     */
    public void addBook(Book book) {
        this.books.add(new Book(book));
    } 

    /**
     * sellBook() - removes a book from the books ArrayList.
     * @param title
     */
    public void sellBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }

    /**
     * contains() - checks if the ArrayList contains the specified object
     * @param book
     */
    public boolean contains(Book book) {
        return this.books.contains(book);
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Store)) {
            return false;
        }
        Store store = (Store) o;
        return Objects.equals(books, store.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }



}
