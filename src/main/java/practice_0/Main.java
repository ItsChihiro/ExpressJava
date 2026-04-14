package practice_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(6);
        System.out.println(list);
        for (Integer num : list) {
            System.out.println(num);
        }


        System.out.println("Task 2");
        for (Integer num : list) {
            if (num % 2 == 0) System.out.println(num);
        }


        System.out.println("Task 3");
        List<String> strings = new ArrayList<>(Arrays.asList("cat", "elephant", "snake"));
        String longestString = "";
        for (String s : strings) {
            if (s.length() > longestString.length()) longestString = s;
        }
        System.out.println("The longest string is: " + longestString);




        System.out.println("LinkedList: Task 1");
        List<String> listOfStrings = new LinkedList<>();

        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.add("four");
        listOfStrings.add("five");

        for (String s: listOfStrings) System.out.println(s);



        System.out.println("LinkedList: Task 2");
        List<String> taskQueue = new LinkedList<>();

        taskQueue.add("Go to gym");
        taskQueue.add("Do homework");
        taskQueue.add("Go to groceries");

        while (!taskQueue.isEmpty()) System.out.println(taskQueue.removeFirst());
    }
}
