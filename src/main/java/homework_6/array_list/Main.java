package homework_6.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        System.out.print("List of integers: ");

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        integers.add(6);

        System.out.println(integers);



        System.out.println("Task 2.");
        StringJoiner joiner = new StringJoiner(", ");

        for (Integer num: integers) {
            if (num % 2 == 0) joiner.add(String.valueOf(num));
        }
        System.out.print("Even numbers: " + joiner);


        System.out.println();
        System.out.println("Task 3.");

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("cat", "elephant", "snake"));
        String longestString = "";

        for (String s : strings) {
            if (s.length() > longestString.length()) longestString = s;
        }

        System.out.println("The longest string: " + longestString);
    }
}
