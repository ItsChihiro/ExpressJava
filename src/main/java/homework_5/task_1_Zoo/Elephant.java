package homework_5.task_1_Zoo;

public class Elephant extends Animal{
    @Override
    void makeSound() {
        System.out.println("Elephant trumpets.");
    }

    @Override
    void move() {
        System.out.println("Elephant goes.");
    }
}
