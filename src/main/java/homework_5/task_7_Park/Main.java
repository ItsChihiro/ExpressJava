package homework_5.task_7_Park;

/**
 *7. Парк развлечений
 * Условие:
 * В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
 * Примеры:
 * Американские горки — проверка безопасности
 * Карусель — техническое обслуживание
 * Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.
 */

public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        RollerCoaster rollerCoaster1 = new RollerCoaster();
        Carousel carousel1 = new Carousel();

        park.setAttraction(carousel1);
        park.showAttractionInfo();

        park.setAttraction(rollerCoaster1);
        park.showAttractionInfo();
    }
}
