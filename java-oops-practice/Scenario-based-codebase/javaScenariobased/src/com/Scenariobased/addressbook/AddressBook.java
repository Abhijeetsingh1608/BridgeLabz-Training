package com.Scenariobased.addressbook;

import java.util.*;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("❌ Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("✅ Contact added successfully");
    }

    public void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println("✏ Contact updated");
                return;
            }
        }
        System.out.println("❌ Contact not found");
    }

    // Delete Contact
    public void deleteContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getFirstName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("🗑 Contact deleted");
                return;
            }
        }
        System.out.println("❌ Contact not found");
    }

    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a.getCity().equalsIgnoreCase(value)
                    || a.getState().equalsIgnoreCase(value)) {
                System.out.println(c);
            }
        }
    }
    public void displayContacts() {
        Collections.sort(contacts);
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
