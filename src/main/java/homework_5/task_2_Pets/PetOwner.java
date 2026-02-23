package homework_5.task_2_Pets;

public class PetOwner {
    private Pet pet;

    public void acceptPet(Pet pet) {
        this.pet = pet;
    }

    public void care() {
        pet.interact();
        pet.feed();
    }
}
