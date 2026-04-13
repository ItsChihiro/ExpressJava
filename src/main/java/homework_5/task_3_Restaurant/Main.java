package homework_5.task_3_Restaurant;

/**
 * 3. Управление рестораном
 * Условие:
 * В меню ресторана добавляется блюдо.
 * У каждого блюда свои параметры отображения:
 * Горячее блюдо — с температурой
 * Напиток — с объёмом
 * Нужно спроектировать систему, в которой можно добавлять блюда
 * и выводить их описание с учётом характеристик.
 */

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        HotDish carbonara = new HotDish(70);

        menu.addDish(carbonara);
        menu.displayDishDescription();

        Drink margarita = new Drink(200);

        menu.addDish(margarita);
        menu.displayDishDescription();
    }
}
