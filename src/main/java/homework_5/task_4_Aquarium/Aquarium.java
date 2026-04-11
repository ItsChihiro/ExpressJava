package homework_5.task_4_Aquarium;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showBehaviour() {
        this.seaCreature.move();
        this.seaCreature.behave();
    }
}
