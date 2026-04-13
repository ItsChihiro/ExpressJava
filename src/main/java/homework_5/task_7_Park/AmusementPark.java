package homework_5.task_7_Park;

public class AmusementPark {
    private Attraction attraction;

    void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showAttractionInfo() {
        if (attraction == null) {
            System.out.println("There are no attractions.");
            return;
        }

        attraction.showInfo();
        attraction.maintain();
    }
}
