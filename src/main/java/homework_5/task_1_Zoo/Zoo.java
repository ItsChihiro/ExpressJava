package homework_5.task_1_Zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void displayBehaviour() {
        this.animal.makeSound();
        this.animal.move();
    }
}
