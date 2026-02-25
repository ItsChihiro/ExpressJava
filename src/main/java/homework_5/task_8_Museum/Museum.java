package homework_5.task_8_Museum;

public class Museum {
    private Exhibit exhibit;

    void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void displayExhibitInfo() {
        this.exhibit.provideInfo();
        this.exhibit.maintain();
    }
}
