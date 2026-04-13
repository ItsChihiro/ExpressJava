package homework_5.task_4_Aquarium;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showBehaviour() {
        if (this.seaCreature == null) {
            System.out.println("Aquarium is empty.");
            return;
        }
        this.seaCreature.move();
    }
}
