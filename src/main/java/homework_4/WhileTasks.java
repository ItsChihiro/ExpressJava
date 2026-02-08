package homework_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        // Task 1 - check a method that prints the factorial of the number
        //printFactorial();

        // Task 2 - check a method that prints all even numbers from 1 to the number entered by the user
        //printEvenNumbers();

        // Task 3 - check a method that reads a positive number from the console and prints a countdown to 1
        //printCountdownFromNumberTo1();
    }

    public static void printFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int i = 1;
        int result = 1;

        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("The factorial of " + number + " is " + result);
    }

    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
    }

    public static void printCountdownFromNumberTo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer positive number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
