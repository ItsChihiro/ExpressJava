package homework_5.task_5_Farm;

public class Farm {
    private Animal animal;

    void addAnimal(Animal animal) {
        this.animal = animal;
    }

    void manageAnimal() {
        if (animal == null) {
            System.out.println("There are no animals.");
            return;
        }
        animal.function();
        animal.care();
    }
}
