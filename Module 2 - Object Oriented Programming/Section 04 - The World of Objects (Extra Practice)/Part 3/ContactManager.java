import java.util.Arrays;

/**
 * ContactsManager Class
 */

public class ContactManager {
    
    // Instance variables (private)
    private Contact[] contacts;

    // Constructor with parameters
    public ContactManager(Contact[] contacts) {
        // Set field equal to a new array with the same length as the parameter
        // Set each element in the field equal to a deep copy of an object in the contacts parameter
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    // Getter for contact
    public Contact getContact(int index) {
        // Return deep copy of object at that index
        return new Contact(contacts[index]);
    }

    // Setter for contact
    public void setContact(Contact contact, int index) {
        // Set the Contact object at the specified index to a deep copy of the given object
        this.contacts[index] = new Contact(contact);
    }
}
