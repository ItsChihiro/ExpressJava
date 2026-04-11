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
    static void main(String[] args) {
        Zoo zoo1 = new Zoo();

        Bird bird1 = new Bird();

        zoo1.addAnimal(bird1);
        zoo1.displayBehaviour();

        Zoo zoo2 = new Zoo();

        Elephant elephant1 = new Elephant();

        zoo2.addAnimal(elephant1);
        zoo2.displayBehaviour();
    }
}
