package practices.practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        // проверка таблицы умножения ддя числа
        //multiplyTable(5);

        // проверка суммы всех чисел до числа
        // System.out.println(sumOfAllNumber(10));

        // проверка метода по определению простого числа
        // System.out.println(checkNumberIsSimple(7));
        // System.out.println(checkNumberIsSimple(6));

        // проверка метода по распечатке всех простых чисел до 100
        printAllSimpleNumbersBefore100();
    }

    public static  void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumber(int n) {
        int sum = 0;

        // step 1: sum = 0; i = 1 -> sum = 1
        // step 2: sum = 1; i = 2 -> sum = 3
        // step 3: sum = 3; i = 3 -> sum = 6
        // step 4: sum = 6; i = 4 -> sum = 10

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static boolean checkNumberIsSimple(int number) {
        // простое число - это число, которое делится на себя и на 1
        // 7 - 7, 1
        // как понять, что число простое?
        // необходимо пройтись от 1 до number и проверить, если ли хотя бы 1 число при делении на которое мы получаем остаток 0

        // Пример: 7
        // 2, 3, 4, 5, 6, 7 -> простое

        // Пример: 6
        // 2 -> не простое
        boolean isSimple = true;

        for (int i = 2; i<= number-1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100() {
        for (int i = 2; i <= 100; i++) {
            if (checkNumberIsSimple(i)) {
                System.out.println(i);
            }
        }
    }
}
