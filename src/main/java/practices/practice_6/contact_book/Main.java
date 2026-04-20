package practices.practice_6.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Sam", 1233);
        contactBook.addContact("Luk", 1234);

        contactBook.printContacts();

        contactBook.updatePhone("Luk", 2563);
        contactBook.printContacts();
    }
}
