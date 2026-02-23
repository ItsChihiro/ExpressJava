package practice_5.task_2;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("Mug ", 100, 2);
        Item microphone = new Electronics("Microphone", 10000, 1);
        Item dress = new Clothes("Dress", 5000, 3);

        Manager manager = new Manager();

        manager.manage(mug);
        manager.manage(microphone);
        manager.manage(dress);
    }
}
