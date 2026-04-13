package homework_5.task_1_Zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void displayBehaviour() {
        if (this.animal == null) {
            System.out.println("There are no animals.");
            return;
        }
        this.animal.makeSound();
        this.animal.move();
    }
}
