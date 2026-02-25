package homework_5.task_5_Farm;

public class Chicken extends Animal {

    @Override
    void function() {
        System.out.println("Chicken gives eggs.");
    }

    @Override
    void care() {
        System.out.println("Chicken needs grain.");
    }
}
