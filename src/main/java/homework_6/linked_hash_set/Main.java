package homework_6.linked_hash_set;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2.");

        LinkedHashSet<String> stringSet = new LinkedHashSet<>();

        addUniqueString(stringSet, "one");
        addUniqueString(stringSet, "two");
        addUniqueString(stringSet, "one");
        addUniqueString(stringSet, "three");
    }


    public static void addUniqueString(LinkedHashSet<String> set, String element) {
        if (set.contains(element)) {
            System.out.println(element + " is not unique string, nothing changed: " + set);
        } else {
            set.add(element);
            System.out.println(element + " is added, updated set: " + set);
        }
    }
}
