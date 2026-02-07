package homework_4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        // Task 1 - check a method that reads a number from 1 to 7 and prints the corresponding day of the week
        //printDayOfWeek();

        // Task 2 - check a method that that determines the ticket price based on the day of the week
        //System.out.println(getTicketPriceByDayOfWeek());

        // Task 3 - check a method that converts a number from 0 to 100 into a letter grade based on a grading scale
        //System.out.println("Your grade is " + transferNumberGradeToLetter());

        // Task 4 - check a method that reads a command and prints the corresponding message
        //System.out.println(processCommand());

        // Task 5 - check a method that takes two numbers and an operator and prints the result
        //calculator();
    }

    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 7: ");
        int number = scanner.nextInt();

        String dayOfWeek;

        switch (number) {
            case 1 -> dayOfWeek = "Monday";
            case 2 -> dayOfWeek = "Tuesday";
            case 3 -> dayOfWeek = "Wednesday";
            case 4 -> dayOfWeek = "Thursday";
            case 5 -> dayOfWeek = "Friday";
            case 6 -> dayOfWeek = "Saturday";
            case 7 -> dayOfWeek = "Sunday";
            default -> dayOfWeek = "A non-existent day of week";
        }
        System.out.println(dayOfWeek);
    }

    public static String getTicketPriceByDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 7: ");
        int dayOfWeek = scanner.nextInt();

        return (dayOfWeek >= 1 && dayOfWeek <= 5) ? "300 rubles" : "450 rubles";
    }

    public static String transferNumberGradeToLetter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 0 to 100: ");
        int number = scanner.nextInt();

        String letter;

        if (number >= 90 && number < 100) letter = "A";
        else if (number >= 80) letter = "B";
        else if (number >= 70) letter = "C";
        else if (number >= 60) letter = "D";
        else letter = "F";

        return letter;
    }

    public static String processCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a command 'start', 'stop', 'restart', or 'status': ");
        String command = scanner.nextLine();

        String message;

        switch (command) {
            case "start" -> message = "Program started";
            case "stop" -> message = "Program stopped";
            case "restart" -> message = "Program restarted";
            case "status" -> message = "Status: OK";
            default -> message = "Unknown command";
        }
        return message;
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter a second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        double calcResult;
        boolean isValid = true;

        switch (operator) {
            case "+" -> calcResult = number1 + number2;
            case "-" -> calcResult = number1 - number2;
            case "*" -> calcResult = number1 * number2;
            case "/" -> calcResult = number1 / number2;
            default -> {
                isValid = false;
                calcResult = 0;
            }
        }

        if (!isValid) System.out.println("Operator is unknown, it's impossible to do operation");
        else System.out.println(number1 + " " + operator + " " + number2 + " = " + calcResult);
    }
}
