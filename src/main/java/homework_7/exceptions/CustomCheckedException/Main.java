package homework_7.exceptions.CustomCheckedException;

public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(151);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
