package practices.practice_8.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setElement("Element");
        System.out.println(stringBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(3);
        System.out.println(integerBox.getElement());


        Box<Book> bookBox = new Box<>();
        bookBox.setElement(new Book("Book"));
        System.out.println(bookBox.getElement());
    }
}
