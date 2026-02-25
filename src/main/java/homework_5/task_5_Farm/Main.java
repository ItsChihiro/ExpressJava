package homework_5.task_5_Farm;

/**
 *5. Ферма
 * Условие:
 * На ферме содержится одно домашнее животное.
 * У каждого животного свои функции и нужды.
 * Примеры:
 * Корова даёт молоко, нуждается в выпасе
 * Курица несёт яйца, требует зерно
 * Нужно создать систему, которая позволяет
 * управлять животным с учётом его потребностей.
 */

public class Main {
    static void main(String[] args) {
        Farm farm1 = new Farm();
        Farm farm2 = new Farm();

        Cow cow1 = new Cow();
        Chicken chicken1 = new Chicken();

        farm1.addAnimal(cow1);
        farm1.manageAnimal();

        farm2.addAnimal(chicken1);
        farm2.manageAnimal();
    }
}
