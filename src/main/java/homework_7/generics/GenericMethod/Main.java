package homework_7.generics.GenericMethod;

public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        String[] strings = {"A", "B", "C"};

        printArray(integers);
        printArray(strings);
    }
}
