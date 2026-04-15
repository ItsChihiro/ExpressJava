package homework_6.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        System.out.print("List of integers: ");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(6);

        System.out.println(list);



        System.out.println("Task 2.");
        System.out.print("Even numbers: ");
        for (Integer num: list) {
            if (num % 2 == 0) System.out.print(num + ", ");
        }


        System.out.println();
        System.out.println("Task 3.");

        List<String> strings = new ArrayList<>(Arrays.asList("cat", "elephant", "snake"));
        String longestString = "";

        for (String s : strings) {
            if (s.length() > longestString.length()) longestString = s;
        }

        System.out.println("The longest string: " + longestString);
    }
}
