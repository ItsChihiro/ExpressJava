package homework_7.generics.GenericClass;

public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(1);
        System.out.println(integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("A");
        System.out.println(stringBox.getItem());
    }
}
