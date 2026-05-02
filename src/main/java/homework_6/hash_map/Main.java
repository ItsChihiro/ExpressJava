package homework_6.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Maria", 20);
        hashMap.put("Sam", 22);
        hashMap.put("Mark", 31);
        hashMap.put("Eva", 17);
        hashMap.put("Olga", 18);

        System.out.print("Print Raw HashMap: " + hashMap);
        System.out.println();

        System.out.println("Print Formatted HashMap: ");
        for (Map.Entry<String, Integer> map: hashMap.entrySet()) {
            System.out.println("Name: " + map.getKey() + ", age: " + map.getValue());
        }



        System.out.println("Task 3.");

        HashMap<String, Integer> users = new HashMap<>();

        users.put("Maria", 10);
        users.put("Sam", 12);
        users.put("Mark", 19);
        users.put("Eva", 17);
        users.put("Olga", 18);
        users.put("Adam", 16);

        printUsersUnderAge(users, 18);
    }


    public static void printUsersUnderAge(HashMap<String, Integer> users, int age) {
        System.out.println("Users is under " + age + ": ");
        for (Map.Entry<String, Integer> map: users.entrySet()) {
            if (map.getValue() < age) {
                System.out.println("Name: " + map.getKey() + ", age: " + map.getValue());
            }
        }
    }
}
