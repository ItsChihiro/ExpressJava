package homework_6.tree_map;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2.");

        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("12345", "Maria");
        treeMap.put("22345", "Fred");
        treeMap.put("32345", "Sam");
        treeMap.put("13345", "Nick");

        System.out.println("The min key in treeMap: " + treeMap.firstKey());
        System.out.println("The max key in treeMap: " + treeMap.lastKey());
    }
}
