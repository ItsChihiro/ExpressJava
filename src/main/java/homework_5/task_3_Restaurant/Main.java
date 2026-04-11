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
    static void main(String[] args) {
        Menu menu1 = new Menu();

        HotDish carbanora = new HotDish(70);

        menu1.addDish(carbanora);
        menu1.displayDishDescription();

        Menu menu2 = new Menu();

        Drink margarita = new Drink(200);

        menu2.addDish(margarita);
        menu2.displayDishDescription();
    }
}
