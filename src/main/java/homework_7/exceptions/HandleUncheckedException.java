package homework_7.exceptions;

public class HandleUncheckedException {
    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero.");
        }
    }
    public static void main(String[] args) {
        divideNumbers(5, 0);
    }
}
