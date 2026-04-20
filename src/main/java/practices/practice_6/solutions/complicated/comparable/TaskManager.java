package practices.practice_6.solutions.complicated.comparable;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Список дел
 * Необходимо сохранить список задач,
 * который можно пополнять, удалять,
 * сортировать по сроку выполнения.
 *
 * Алгоритм решения:
 * 1) выбор структуры данных
 * линейная (список или массив?)
 * какие популярные операции?
 * если доступ к элементу и редко изменения размера (вставка, удаление) -> МАССИВ
 * если редко доступ к элементу и часто изменение размера (вставка, удаление) -> СПИСОК
 *
 * Решение: список
 *
 * 2) проектирование элемента структуры данных
 * Задача:
 *      название: String
 *      срок выполнения: int, Date
 *
 * 3) Как реализовать сортировку,
 */
public class TaskManager {
    private LinkedList<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("Log: Task " + task.getName() + " is added.");
    }

    public void removeTaskByName(String name) {
        // Шаг 1: найти задачу
        Task foundTask = null;

        for (Task task: tasks) {
            if (task.getName().equals(name)) {
                foundTask = task;
            }
        }

        // Обработали ситуацию, когда задача не найдена по имени
        if (foundTask == null) {
            System.out.println("Error: task with name " + name + " not found.");
            return;
        }

        // Шаг 2: удалить задачу
        this.tasks.remove(foundTask);
        System.out.println("Log: task " + name + " removed.");
    }

    public LinkedList<Task> sortByDeadline() {
        // Вариант №1: написать сортировку (пузырьком) минус: создаем велосипед с нуля
        // Вариант №2: переиспользовать существующую сортировку из Collections.sort();

        // Сортировка для примитивных типов данных: работает по умолчанию
        // Java знает, что больше из примитивных типов (например, int 8 > 4)
        // Java НЕ знает, что больше для класса Task (ссылочный тип данных)
        // Нужно объяснить Java, как сравнивать Task

        LinkedList<Task> sortedTasks = new LinkedList<>(tasks);
        Collections.sort(sortedTasks);
        System.out.println("Log: list of tasks sorted by deadline.");
        return sortedTasks;
    }
}
