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
    static void main(String[] args) {
        AmusementPark wonderPark = new AmusementPark();
        AmusementPark crazyPark = new AmusementPark();

        RollerCoaster rollerCoaster1 = new RollerCoaster();
        Carousel carousel1 = new Carousel();

        wonderPark.setAttraction(carousel1);
        wonderPark.showAttractionInfo();

        crazyPark.setAttraction(rollerCoaster1);
        crazyPark.showAttractionInfo();
    }
}
