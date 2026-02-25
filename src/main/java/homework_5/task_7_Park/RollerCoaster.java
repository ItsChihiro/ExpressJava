package homework_5.task_7_Park;

public class RollerCoaster extends Attraction implements Maintainable {

    @Override
    void showInfo() {
        System.out.println("Roller Coaster: fast ride with steep drops and sharp turns.");
    }

    @Override
    public void maintain() {
        System.out.println("Roller Coaster regular safety check.");
    }
}
