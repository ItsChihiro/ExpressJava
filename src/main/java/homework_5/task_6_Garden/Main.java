package homework_5.task_6_Garden;

/**
 *6. Ботанический сад
 * Условие:
 * В ботаническом саду содержится одно растение.
 * У разных растений — разные требования к уходу.
 * Примеры:
 * Орхидея — высокая влажность и тень
 * Кактус — много света, редкий полив
 * Нужно спроектировать систему, в которой можно добавить растение
 * и обеспечить нужный уход.
 */

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.care();

        Orchid orchid1 = new Orchid();
        Cactus cactus1 = new Cactus();

        garden.addPlant(orchid1);
        garden.care();

        garden.addPlant(cactus1);
        garden.care();
    }
}
