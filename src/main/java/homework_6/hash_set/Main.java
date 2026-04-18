package homework_6.hash_set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");

        Set<Integer> hashSet1 = new java.util.HashSet<>();

        hashSet1.add(10);
        hashSet1.add(20);
        hashSet1.add(30);
        hashSet1.add(40);
        hashSet1.add(50);

        System.out.println("Five numbers in HashSet: " + hashSet1);



        System.out.println("Task 3.");

        List<String> list3 = new ArrayList<>(Arrays.asList("Math", "English", "Biology", "Math", "English"));
        System.out.println("List without duplicates: " + removeDuplicates(list3));



        System.out.println("Task 4.");

        Set<String> names = new HashSet<>();

        names.add("Maria");
        names.add("Anastasia");
        names.add("Anna");

        String defaultName1 = "Maria";
        String defaultName2 = "Diana";

        checkIfNameInSet(defaultName1, names);
        checkIfNameInSet(defaultName2, names);
    }


    public static Set<String> removeDuplicates(List<String> input) {
        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(input);
        return hashSet;
    }


    public static void checkIfNameInSet(String name, Set<String> names) {
        if (names.contains(name)) {
            System.out.println("Name " + name + " is found.");
        } else System.out.println("Name " + name + " is not found.");
    }
}
