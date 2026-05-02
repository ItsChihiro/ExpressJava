package practices.practice_6.photo_editor;

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addNewAction("Edit eyes");
        photoEditor.addNewAction("Edit nose");
        photoEditor.addNewAction("Edit ears");
        photoEditor.addNewAction("Edit body");

        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.undoLastAction();

        photoEditor.printActions();
    }
}
