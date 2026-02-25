package homework_5.task_8_Museum;

public class Manuscript extends Exhibit {
    @Override
    void provideInfo() {
        System.out.println("This is an ancient text.");
    }

    @Override
    void maintain() {
        System.out.println("Manuscript requires specific temperature and humidity control.");
    }
}
