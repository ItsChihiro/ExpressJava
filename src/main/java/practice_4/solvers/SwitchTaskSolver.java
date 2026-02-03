package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();

        // проверка метода возвращающего день недели по числу
         System.out.println(dayOfWeek(2));
         System.out.println(dayOfWeek(15));


        // проверка метода по описанию сезона
         System.out.println(describeSeason(Season.WINTER));
         System.out.println(describeSeason(Season.SPRING));
    }
    public static String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
               dayOfWeek = "A non-existent day of week";
        }

        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";

        switch (season) {
            case WINTER -> description = "Зима - холодно и снежно.";
            case SUMMER -> description = "Лето - жарко.";
            case SPRING -> description = "Весна - все цветет";
            case AUTUMN -> description = "Осень - листья желтеют.";
        }

        return description;
    }
}
