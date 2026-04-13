package homework_5.task_7_Park;

public class Carousel extends Attraction {
    @Override
    void showInfo() {
        System.out.println("Carousel: slow ride with rotating horses.");
    }

    @Override
    void maintain() {
        System.out.println("Carousel regular service.");
    }
}
