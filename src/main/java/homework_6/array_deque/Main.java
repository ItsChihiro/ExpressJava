package homework_6.array_deque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 3.");

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Change 1.");
        deque.addLast("Change 2.");
        deque.addFirst("Change 3.");
        deque.addLast("Change 4.");

        System.out.println("deque after adding the elements: " + deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println("deque after removing the elements: " + deque);
    }
}
