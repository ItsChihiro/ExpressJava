package homework_2;

public class Teacher {
    String name, subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println("Teacher " + this.name + ", subject " + this.subject);
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Maria", "English");
        teacher1.setSubject("Math");
        teacher1.printInfo();
    }
}
