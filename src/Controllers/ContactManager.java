package Controllers;

import java.util.LinkedList;

import Models.Contact;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<String, String> contact) {
        this.contacts.add(contact);
    }

    /*public Contact<String, String> findContactByName(String name) {
        contacts.appendToTail(contact);
    }*/

    public void deleteContactByName(String name) {

    }

    public void printList() {

    }
}
