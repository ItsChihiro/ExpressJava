package homework_5.task_4_Aquarium;

/**
 * 4. Аквариум
 * Условие:
 * В аквариуме может находиться одно морское существо.
 * В зависимости от существа, оно ведёт себя по-разному.
 * Примеры:
 * Акула плавает быстро и агрессивно
 * Морская звезда медленно ползает
 * Нужно спроектировать систему,
 * в которой можно добавить существо и продемонстрировать его поведение.
 */

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.showBehaviour();

        StarFish starFish1 = new StarFish();

        aquarium.addSeaCreature(starFish1);
        aquarium.showBehaviour();

        Shark shark1 = new Shark();

        aquarium.addSeaCreature(shark1);
        aquarium.showBehaviour();
    }
}
