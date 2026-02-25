package homework_5.task_7_Park;

public class AmusementPark {
    private Attraction attraction;

    void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showAttractionInfo() {
        this.attraction.showInfo();
        if (this.attraction instanceof Maintainable) ((Maintainable) this.attraction).maintain();
    }
}
