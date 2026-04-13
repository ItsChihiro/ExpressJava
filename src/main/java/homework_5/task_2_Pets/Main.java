package homework_5.task_2_Pets;


/**
 * 2. Управление домашними питомцами
 * Условие:
 * В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
 * Примеры:
 * Собака гуляет и ест сухой корм
 * Кошка играет и ест влажный корм
 * Нужно спроектировать систему, которая позволяет
 * взаимодействовать с любым питомцем с учётом его особенностей.
 */

public class Main {
    public static void main(String[] args) {
        PetOwner owner = new PetOwner();

        Cat murka = new Cat();

        owner.acceptPet(murka);
        owner.care();

        Dog muhtar = new Dog();

        owner.acceptPet(muhtar);
        owner.care();
    }
}
