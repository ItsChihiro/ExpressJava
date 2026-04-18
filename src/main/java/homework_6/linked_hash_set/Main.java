package homework_6.linked_hash_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2.");

        Set<String> stringSet = new LinkedHashSet<>();

        addUniqueElements(stringSet, "one");
        addUniqueElements(stringSet, "two");
        addUniqueElements(stringSet, "one");
        addUniqueElements(stringSet, "three");
    }


    public static void addUniqueElements(Set<String> set, String element) {
        if (set.contains(element)) {
            System.out.println(element + " is not unique string, nothing changed: " + set);
        } else {
            set.add(element);
            System.out.println(element + " is added, updated set: " + set);
        }
    }
}
