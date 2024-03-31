import java.util.Scanner;

/**
 * Main Class
 */

public class Main {
    public static void main(String[] args) {

        // Create a Scanner instance
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a title, publisher, issue number and publication year
        String title = promptForTitle(scan);
        String publisher = promptForPublisher(scan);
        int issueNumber = promptForIssueNumber(scan);
        int publicationYear = promptForPublicationYear(scan);

        // Create a Magazine object using the variables defined above
        Magazine magazine = new Magazine(title, publisher, issueNumber, publicationYear);

        // Create a MagazineLibrary object to store the Magazine objects
        MagazineLibrary library = new MagazineLibrary();

        // Add the Magazine object to the MagazineLibrary object
        library.addMagazine(magazine);
        System.out.println("Magazine added to the library: " + magazine.getTitle());
    
    }

    /**
     * isNullOrBlank() - returns true if the input is null or blank
     * @param input
     * @return
     */
    public static boolean isNullOrBlank(String input) {
        if (input == null || input.isBlank()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * incorrectIssueNumber() - returns true if the issue number is less than or equal to 0
     * @param issueNumber
     * @return
     */
    public static boolean incorrectIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * incorrectPublicationYear() - returns true if the publication year is less than or equal to 0 
     * @param publicationYear
     * @return
     */
    public static boolean incorrectPublicationYear(int publicationYear) {
        if (publicationYear <= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * promptForTitle() - retuns a valid title entered by the user
     * @param scan
     * @return
     */
    public static String promptForTitle(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            String title = scan.nextLine();
            if (!isNullOrBlank(title)) {
                return title;
            } 
        }
    }

    /**
     * promptForPublisher() - returns a valid publisher entered by the user
     * @param scan
     * @return
     */
    public static String promptForPublisher(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher ");
            String publisher = scan.nextLine();
            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }

    /**
     * promptForIssueNumber() - returns a valid issue number entered by the user
     * @param scan
     * @return
     */
    public static int promptForIssueNumber(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number: ");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int issueNumber = scan.nextInt();
            if (!incorrectIssueNumber(issueNumber)) {
                return issueNumber;
            }
        }
    }

    /**
     * promptForPublicationYear() - returns a valid publication year entered by the user
     * @param scan
     * @return
     */
    public static int promptForPublicationYear(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year: ");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int publicationYear = scan.nextInt();
            if (!incorrectPublicationYear(publicationYear)) {
                return publicationYear;
            }
        }
    }
}