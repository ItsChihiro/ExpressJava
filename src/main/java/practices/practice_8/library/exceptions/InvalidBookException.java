package practices.practice_8.library.exceptions;

//  непроверяемое исключение -> RuntimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}
