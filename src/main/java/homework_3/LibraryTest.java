package homework_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library1 = new Library();

        // bookTitle is private and not accessible here
        // System.out.println(library1.bookTitle);

        library1.setBookTitle("Idiot");
        System.out.println("Book title is " + library1.getBookTitle());

        library1.setAuthor("Fedor Dostoevsky");
        System.out.println("Book author is " + library1.author);

        library1.setYear(1869);
        System.out.println("Book year of publishing: " + library1.year);

        library1.setCategory("novel");
        System.out.println("Book category: " + library1.category);
    }
}
