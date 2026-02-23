package homework_5.task_3_Restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void displayDishDescription() {
        dish.displayDescription();
    }
}
