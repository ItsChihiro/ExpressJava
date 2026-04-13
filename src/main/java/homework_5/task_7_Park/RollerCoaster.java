package homework_5.task_7_Park;

public class RollerCoaster extends Attraction {
    @Override
    void showInfo() {
        System.out.println("Roller Coaster: fast ride with steep drops and sharp turns.");
    }

    @Override
    void maintain() {
        System.out.println("Roller Coaster regular safety check.");
    }
}
