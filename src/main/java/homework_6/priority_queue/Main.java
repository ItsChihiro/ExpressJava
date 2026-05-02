package homework_6.priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static void main(String[] args) {
        System.out.println("Task 1.");

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(4);

        System.out.println("Priority queue: " + priorityQueue);

        System.out.println("Priority queue processing: ");
        while (!priorityQueue.isEmpty()) System.out.println(priorityQueue.poll());
    }
}
