package homework_5.task_2_Pets;

public class Cat extends Pet{

    @Override
    void interact() {
        System.out.println("Cat plays.");
    }

    @Override
    void feed() {
        System.out.println("Cat eats wet food.");
    }
}
