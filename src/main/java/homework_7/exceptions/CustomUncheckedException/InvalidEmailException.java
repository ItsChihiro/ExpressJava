package homework_7.exceptions.CustomUncheckedException;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}
