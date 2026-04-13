package homework_5.task_8_Museum;

public class Museum {
    private Exhibit exhibit;

    void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void displayExhibitInfo() {
        if (exhibit == null) {
            System.out.println("There are no exhibits.");
            return;
        }
        exhibit.provideInfo();
        exhibit.maintain();
    }
}
