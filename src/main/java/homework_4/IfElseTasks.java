package homework_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        // Task 1 - check a method that defines a sign of any number
        //System.out.println(getNumberSign());

        // Task 2 - check a method that finds a max number of two numbers
        //printMaxOfTwoNumbers();

        // Task 3 - check a method that prints the grade description based on a 1-5 scale
        //printGradeDescription();

        // Task 4 - check a method that prints parity of a number
        //System.out.println(checkParity());

        // Task 5 - check a method that defines a discount by age
        //System.out.println("The discount is " + getDiscountByAge() + " %");

        // Task 6 - check a method that print test result description based on 0-100 scale
        //printTestResultDescription();
    }

    public static String getNumberSign() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        double number = scanner.nextDouble();

        String signDescription;
        if (number > 0) signDescription = "Number is positive";
        else if (number < 0) signDescription = "Number is negative";
        else signDescription = "Number is 0";

        return signDescription;
    }

    public static void printMaxOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        double maxNumber = (number1 > number2) ? number1 : number2;

        System.out.println("The max number is " + maxNumber);
    }

    public static void printGradeDescription() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade number from 1 to 5: ");
        int grade = scanner.nextInt();

        while (grade < 1 || grade > 5) {
            System.out.print("Enter grade number from 1 to 5: ");
            grade = scanner.nextInt();
        }

        String gradeDescription;

        if (grade == 5) gradeDescription = "Excellent";
        else if (grade == 4) gradeDescription = "Good";
        else if (grade == 3) gradeDescription = "Satisfactory";
        else gradeDescription = "Unsatisfactory";

        System.out.println("Grade is " + gradeDescription);
    }

    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        return (number % 2 == 0) ? "even" : "odd";
    }

    public static int getDiscountByAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age number: ");
        int age = scanner.nextInt();

        while (age < 0 || age > 150) {
            System.out.print("Enter your age number: ");
            age = scanner.nextInt();
        }

        int discount = 0;
        if (age < 18) discount = 25;
        else if (age >= 65) discount = 30;

        return discount;
    }

    public static void printTestResultDescription() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test result from 0-100: ");
        int testResult = scanner.nextInt();

        while (testResult < 0 || testResult > 100) {
            System.out.print("Enter your test result from 0-100: ");
            testResult = scanner.nextInt();
        }

        String resultDescription;

        if (testResult >= 90) resultDescription = "Excellent";
        else if (testResult >= 75) resultDescription = "Good";
        else if (testResult >= 60) resultDescription = "Satisfactory";
        else resultDescription = "Unsatisfactory";

        System.out.println("Test result is " + resultDescription);
    }
}
