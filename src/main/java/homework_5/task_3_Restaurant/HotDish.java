package homework_5.task_3_Restaurant;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    void displayDescription() {
        System.out.println("Hot dish temperature: " + this.temperature + " degrees.");
    }
}
