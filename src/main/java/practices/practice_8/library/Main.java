package practices.practice_8.library;

import practices.practice_8.library.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "Джордж Оруэлл"));
        library.addBook(new Book("Мартин Иден", "Джек Лондон"));
        library.addBook(new Book("Евгений Онегин", "Александр Пушкин"));
        //library.addBook(new Book("Евгений Онегин", "Александр Пушкин"));

        try {
            library.findBook("1994");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение");;
        }
    }
}
