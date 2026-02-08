package homework_4;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        // Task 1 - check a method that takes numbers and prints the sum of numbers until the first negative number
        //printSumOfPositiveNumbers();

        // Task 2 - check a method that prints numbers from 1 to 20, skipping numbers divisible by 3
        //printNumbersFrom1To20NotDivisibleBy3();

        // Task 3 - check a method that outputs only positive numbers
        //printOnlyPositiveNumbers();

        // Task 4 - check a method that outputs strings until "stop"
        //inputStringUntilStop();
    }

    public static void printSumOfPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        while (true) {
            System.out.print("Enter any number: ");
            double number = scanner.nextDouble();

            if (number < 0) break;

            sum += number;
        }
        System.out.println("Sum of numbers is " + sum);
    }

    public static void printNumbersFrom1To20NotDivisibleBy3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }

    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 0 to stop the program, enter any other number to continue : ");
            double number = scanner.nextDouble();

            if (number == 0) break;

            if (number < 0) continue;

            System.out.println(number);
        }
    }

    public static void inputStringUntilStop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) break;
            System.out.println(input);
        }
    }
}
