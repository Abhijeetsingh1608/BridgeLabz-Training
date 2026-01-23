package com.Scenariobased.addressbook;

public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Hyderabad", "Charminar", "400001");
        Address a2 = new Address("Delhi", "Delhi", "110001");

        Contact c1 = new Contact("Abhijeet", "Singh",
                "9876543210", "Abhijeet@gmail.com", a1);

        Contact c2 = new Contact("Amit", "Verma",
                "9123456780", "amit@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);

        System.out.println("\n📌 All Contacts:");
        book.displayContacts();

        System.out.println("\n📌 Search by City:");
        book.searchByCityOrState("Hyderabad");

        System.out.println("\n📌 Edit Contact:");
        book.editContact("Abhijeet", "9999999999", "Abhijeet_new@gmail.com");

        System.out.println("\n📌 After Edit:");
        book.displayContacts();

        System.out.println("\n📌 Delete Contact:");
        book.deleteContact("Amit");

        System.out.println("\n📌 Final Contacts:");
        book.displayContacts();
    }
}
