import java.util.ArrayList;

/**
 * MagazineLibrary Class
 */

public class MagazineLibrary {
    
    // Instance variable (private)
    private ArrayList<Magazine> magazines;

    // Constructor that initializes the magazines field to an empty ArrayList
    public MagazineLibrary() {
        magazines = new ArrayList<>();
    }

    // Getter for a magazine from magzines ArrayList
    public Magazine getMagazine(int index) {
        return new Magazine(this.magazines.get(index));
    }

    // Setter for magazine
    public void setMagazine(Magazine magazine, int index) {
        this.magazines.set(index, new Magazine(magazine));
        System.out.println("Magazine " + magazine + " set.");
    }

    /**
     * addMagazine() - adds a deep copy of a Magazine object in the magazines ArrayList
     * @param magazine
     */
    public void addMagazine(Magazine magazine) {
        this.magazines.add(new Magazine(magazine));
        System.out.println("Magazine " + magazine.getTitle() + " added.");
    }
}
