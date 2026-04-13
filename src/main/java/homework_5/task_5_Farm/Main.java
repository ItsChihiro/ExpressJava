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
    public static void main(String[] args) {
        Farm farm = new Farm();

        Cow cow1 = new Cow();
        Chicken chicken1 = new Chicken();

        farm.addAnimal(cow1);
        farm.manageAnimal();

        farm.addAnimal(chicken1);
        farm.manageAnimal();
    }
}
