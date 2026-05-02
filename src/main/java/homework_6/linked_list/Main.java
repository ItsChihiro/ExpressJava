package homework_6.linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");

        LinkedList<String> listOfStrings = new LinkedList<>();

        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.add("four");
        listOfStrings.add("five");

        System.out.println("Five strings: ");
        for (String s: listOfStrings) {
            System.out.println(s);
        }



        System.out.println("Task 2.");

        LinkedList<String> tasksQueue = new LinkedList<>();

        tasksQueue.add("Go to gym");
        tasksQueue.add("Do homework");
        tasksQueue.add("Make an order");

        System.out.println("Tasks queue: " + tasksQueue);
        System.out.println("Process 3 tasks in order of arriving: ");
        while (!tasksQueue.isEmpty()) System.out.println(tasksQueue.removeFirst());
    }
}
