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
    static void main(String[] args) {
        PetOwner owner1 = new PetOwner();

        Cat murka = new Cat();

        owner1.acceptPet(murka);
        owner1.care();

        PetOwner owner2 = new PetOwner();

        Dog muhtar = new Dog();

        owner2.acceptPet(muhtar);
        owner2.care();
    }
}
