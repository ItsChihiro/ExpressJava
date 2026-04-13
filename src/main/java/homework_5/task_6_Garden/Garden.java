package homework_5.task_6_Garden;

public class Garden {
    private Plant plant;

    void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void care() {
        if (plant == null) {
            System.out.println("There are no plants.");
            return;
        }
        plant.care();
    }
}
