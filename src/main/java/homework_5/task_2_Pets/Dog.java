package homework_5.task_2_Pets;

public class Dog extends Pet{

    @Override
    void interact() {
        System.out.println("Dog walks.");
    }

    @Override
    void feed() {
        System.out.println("Dog eats dry food.");
    }
}
