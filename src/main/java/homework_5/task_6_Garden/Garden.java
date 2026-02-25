package homework_5.task_6_Garden;

public class Garden {
    private Plant plant;

    void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void care() {
        this.plant.care();
    }
}
