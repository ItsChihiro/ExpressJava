package homework_5.task_8_Museum;

/**
 *8. Музей
 * Условие:
 * В музее выставлен экспонат.
 * У каждого экспоната своя история и условия хранения.
 * Примеры:
 * Манускрипт — требует контролируемой влажности
 * Скульптура — нуждается в реставрации
 * Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
 */

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Manuscript manuscript1 = new Manuscript();
        Sculpture sculpture1 = new Sculpture();

        museum.setExhibit(manuscript1);
        museum.displayExhibitInfo();

        museum.setExhibit(sculpture1);
        museum.displayExhibitInfo();
    }
}
