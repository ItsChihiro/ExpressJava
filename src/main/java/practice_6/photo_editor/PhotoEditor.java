package practice_6.photo_editor;

import java.util.Stack;

public class PhotoEditor {
    // хранить последние действия
    private Stack<String> actions;

    public PhotoEditor() {
        this.actions = new Stack<>();
    }

    // добавление нового действия
    public void addNewAction(String action) {
        actions.push(action);
    }

    // иметь возможность откатить последние действия
    public void undoLastAction() {
        actions.pop();
    }

    public void printActions() {
        System.out.println("All actions: ");
        actions.forEach(System.out::println);
    }
}
