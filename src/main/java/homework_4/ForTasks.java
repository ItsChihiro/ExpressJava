package homework_4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        // Task 1 - check a method that prints all numbers from 1 to 100 that are divisible by 3
        //printNumbers1To100DivisibleBy3();

        // Task 2 - check a method that reads a number n from the console and calculates the sum from 1 to n
        //printSumNumbersfrom1ToN();

        // Task 3 - check a method that prints the multiplication table for a user-entered number
        //printMultiplicationTable();

        // Task 4 - check a method that that checks if a given number is prime and print the answer
        //printNumberIsPrimeCheck();

        // Task 5 - check a method that prints numbers from 1 to 10
        //printNumbersFrom1To10();
    }

    public static void printNumbers1To100DivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
    }

    public static void printSumNumbersfrom1ToN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int n = scanner.nextInt();

        int sumNumbers = 0;

        for (int i = 1; i < n + 1; i++) {
            sumNumbers += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " = " + sumNumbers);
    }

    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static void printNumberIsPrimeCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("The number " + number + " is prime - " + isPrime);
    }

    public static void printNumbersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
