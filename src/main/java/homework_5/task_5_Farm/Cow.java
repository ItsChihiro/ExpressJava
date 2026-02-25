package homework_5.task_5_Farm;

public class Cow extends Animal {

    @Override
    void function() {
        System.out.println("Cow gives milk.");
    }

    @Override
    void care() {
        System.out.println("Cow needs to graze.");
    }
}
