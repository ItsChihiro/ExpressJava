package homework_5.task_8_Museum;

public class Sculpture extends Exhibit {
    @Override
    void provideInfo() {
        System.out.println("This is a sculptural object.");
    }

    @Override
    void maintain() {
        System.out.println("Sculpture requires regular restoration.");
    }
}
