package homework_5.task_4_Aquarium;

public class Shark extends SeaCreature{
    @Override
    void move() {
        System.out.print("Shark swims ");
    }

    @Override
    void behave() {
        System.out.println("fast and aggressive.");
    }
}
