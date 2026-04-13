package homework_5.task_1_Zoo;

/**
 *1. Зоопарк
 * Условие:
 * В зоопарке есть одно животное, но оно может быть разным: птица или слон.
 * Каждое животное издаёт уникальные звуки и передвигается по-своему.
 * Например, слон трубит и ходит, а птица чирикает и летает.
 * Нужно спроектировать систему, которая может работать с любым животным,
 * добавлять его в зоопарк и демонстрировать его поведение.
 */


public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.displayBehaviour();

        Bird bird1 = new Bird();

        zoo.addAnimal(bird1);
        zoo.displayBehaviour();

        Elephant elephant1 = new Elephant();

        zoo.addAnimal(elephant1);
        zoo.displayBehaviour();
    }
}
