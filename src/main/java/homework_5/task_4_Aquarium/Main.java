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
    static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium();

        StarFish starFish1 = new StarFish();

        aquarium1.addSeaCreature(starFish1);
        aquarium1.showBehaviour();

        Aquarium aquarium2 = new Aquarium();

        Shark shark1 = new Shark();

        aquarium2.addSeaCreature(shark1);
        aquarium2.showBehaviour();
    }
}
