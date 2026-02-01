package homework_2;

public class Book {
    String title, author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void printInfo() {
        System.out.println("Book title " + this.title + ", author " + this.author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Lev Tolstoy");
        book1.setAuthor("Alexandr Pushkin");
        book1.printInfo();
    }
}
