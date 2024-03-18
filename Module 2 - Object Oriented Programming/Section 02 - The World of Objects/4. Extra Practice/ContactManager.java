/**
 * ContactManager class
 */

public class ContactManager {

    // Instance variables (private)
    private Contact[] contacts;

    // Constructor with parameters
    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    // Getter for contact
    public Contact getContact(int index) {
        return new Contact(contacts[index]);
    }

    // Setter for contact
    public void setContact(Contact contact, int index) {
        this.contacts[index] = new Contact(contact);
    }


}
