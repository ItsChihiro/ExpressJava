package homework_5.task_5_Farm;

public class Farm {
    private Animal animal;

    void addAnimal(Animal animal) {
        this.animal = animal;
    }

    void manageAnimal() {
        this.animal.function();
        this.animal.care();
    }
}
