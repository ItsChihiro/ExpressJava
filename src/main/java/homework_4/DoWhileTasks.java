package homework_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        // Task 1 - check a method that prompts the user for a number until the positive one is entered
        //requestPositiveNumber();

        // Task 2 - check a method that prompts the user for a password until the correct one is entered
        //checkPassword();

        // Task 3 - check a method that prints numbers from 1 to 10
        //outputFrom1To10();

        // Task 4 - check a method that finishes the program when user enters "exit"
        //finishProgramWhenCommandExit();

        // Task 5 - check a method that counts the number of digits in an integer entered by the user
        //countDigitsInNumber();
    }

    public static void requestPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        double number = -1;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextDouble();
        } while (number <= 0);
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "12345";
        String password;

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals(correctPassword));
        System.out.println("Password is correct!");
    }

    public static void outputFrom1To10() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void finishProgramWhenCommandExit() {
        Scanner scanner = new Scanner(System.in);

        String command;

        do {
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Program is finished");
    }

    public static void countDigitsInNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = Math.abs(scanner.nextInt());

        int count = 0;

        do {
            number = number / 10;
            count++;
        } while (number != 0);

        String countDescription = (count < 2) ? "Number has " + count + " digit" : "Number has " + count + " digits";
        System.out.println(countDescription);
    }
}
