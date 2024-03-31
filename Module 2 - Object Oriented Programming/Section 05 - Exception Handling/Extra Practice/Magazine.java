/**
 * Magazine Class
 */

public class Magazine {
    
    // Instance variables (private)
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    // Constructor with parameters
    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    // Copy constructor
    public Magazine(Magazine source) {
        setTitle(source.title);
        setPublisher(source.publisher);
        setIssueNumber(source.issueNumber);
        setPublicationYear(source.publicationYear);
    }

    // Getter for title
    public String getTitle() { return this.title; }

    // Setter for title
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank!");
        } else {
            this.title = title;
        }
    }

    // Getter for publisher
    public String getPublisher() { return this.publisher; }

    // Setter for publisher
    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher cannot be null o blank!");
        } else {
            this.publisher = publisher;
        }
    }

    // Getter for issueNumber
    public int getIssueNumber() { return this.issueNumber; }

    // Setter for issueNumber
    public void setIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be greater than 0!");
        } else {
            this.issueNumber = issueNumber;
        }
    }

    // Getter for publicationYear
    public int getPublicationYear() { return this.publicationYear; }

    // Setter for publicationYear
    public void setPublicationYear(int publicationYear) {
        if (publicationYear <= 0) {
            throw new IllegalArgumentException("Publication year must be greater than 0!");
        } else {
            this.publicationYear = publicationYear;
        }
    }

    // toString() - prints the Magazine as a String
    @Override
    public String toString() {
        return this.title + " published by " + this.publisher + " with issue #" + this.issueNumber + " from " + this.publicationYear + ".";
    }
}
