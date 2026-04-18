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

        System.out.print("Print HashMap: ");
        System.out.println(hashMap);

        System.out.println("Print HashMap: ");
        for (Map.Entry<String, Integer> map: hashMap.entrySet()) {
            System.out.println("Name: " + map.getKey() + ", age: " + map.getValue());
        }



        System.out.println("Task 3.");

        HashMap<String, Integer> hashMapUsers = new HashMap<>();

        hashMapUsers.put("Maria", 10);
        hashMapUsers.put("Sam", 12);
        hashMapUsers.put("Mark", 19);
        hashMapUsers.put("Eva", 17);
        hashMapUsers.put("Olga", 18);
        hashMapUsers.put("Adam", 16);

        printUsersUnderAge(hashMapUsers, 18);
    }


    public static void printUsersUnderAge(HashMap<String, Integer> users, Integer age) {
        System.out.println("Users is under " + age + ": ");
        for (Map.Entry<String, Integer> map: users.entrySet()) {
            if (map.getValue() < age) {
                System.out.println("Name: " + map.getKey() + ", age: " + map.getValue());
            }
        }
    }
}
