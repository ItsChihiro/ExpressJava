package homework_5.task_4_Aquarium;

public class StarFish extends SeaCreature{
    @Override
    void move() {
        System.out.print("Starfish crawls along the bottom ");
    }

    @Override
    void behave() {
        System.out.println("slow.");
    }
}
