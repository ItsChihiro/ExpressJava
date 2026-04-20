package practices.practice_7;

public class Main {
    public static void main(String[] args) {
        Person nick = new Person("Nick", 25);

        // Значение toString по умолчанию
        System.out.println(nick.toString());

        // Сравнение объектов (примитивные типы данных сравниваются через ==,
        // ссылочные типы данных сравниваются через equals
        Person nick2 = new Person("Nick", 25);

        System.out.println(nick.equals(nick2));

        // Клонирование
        Person cloneNick = nick.clone();
        System.out.println(cloneNick.toString());

        System.out.println(nick.getClass());
    }
}
