package homework_7.exceptions.CustomUncheckedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void checkEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Email is invalid: " + email);
        }
        System.out.println("Email is valid: " + email);
    }

    public static void main(String[] args) {
        try {
            checkEmail("email.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
