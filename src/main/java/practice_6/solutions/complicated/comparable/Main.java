package practice_6.solutions.complicated.comparable;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    static void main(String[] args) {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        Task washDishes = new Task("Wash dishes", Date.from(tomorrow.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Task cleanFloor = new Task("Clean floor", Date.from(yesterday.atStartOfDay(ZoneId.systemDefault()).toInstant()));

        TaskManager taskManager = new TaskManager();

        taskManager.addTask(cleanFloor);
        taskManager.addTask(washDishes);

        System.out.println(taskManager.sortByDeadline());

        taskManager.removeTaskByName("Clean floor");
        taskManager.removeTaskByName("Pick up kids from school");
    }
}
