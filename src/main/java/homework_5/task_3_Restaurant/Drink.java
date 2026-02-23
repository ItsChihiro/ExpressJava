package homework_5.task_3_Restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    void displayDescription() {
        System.out.println("Drink volume: " + this.volume + " ml.");
    }
}
