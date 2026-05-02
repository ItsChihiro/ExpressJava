package practices.practice_8.library.exceptions;

// проверяемое исключение -> Exception
public class BookNotFoundException extends Exception{
    public BookNotFoundException(String message) {
        super(message);
    }
}
