package homework_6.tree_set;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 3.");

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(12);
        treeSet.add(13);

        int target = 12;

        Integer higher = treeSet.higher(target);
        Integer lower =  treeSet.lower(target);

        if (higher != null) System.out.println("The closest big number to " + target + ": " + higher);
        if (lower != null) System.out.println("The closest small number to " + target + ": " + lower);
    }
}
