package homework_7.generics.TwoTypeGeneric;

public class Pair<T, U> {
    private T first;
    private U second;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(1);
        pair.setSecond("Second");

        System.out.println("first: " + pair.getFirst());
        System.out.println("second: " + pair.getSecond());
    }
}
