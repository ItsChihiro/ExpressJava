package homework_6.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2.");

        Map<String, String> contacts = new LinkedHashMap<>();

        contacts.put("Eva", "12345");
        contacts.put("Sam", "22345");
        contacts.put("Nick", "32345");
        contacts.put("Mark", "42345");

        findPhoneNumber(contacts, "Eva");
        findPhoneNumber(contacts, "Nicky");
    }


    public static void findPhoneNumber(Map<String, String> contactBook, String name) {
        if (contactBook.containsKey(name)) {
            System.out.println(name + "'s phone number: " + contactBook.get(name));
        } else System.out.println(name + "'s phone number is not found.");
    }
}
