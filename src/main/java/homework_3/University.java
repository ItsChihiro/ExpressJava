package homework_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Student name is " + this.studentName + ", ID is " + this.studentID + ", University name is " + University.universityName);
    }

    public static void main(String[] args) {
        University student1 = new University(1001, "Mike");
        University student2 = new University(1002, "Peter");
        University student3 = new University(1003, "Max");
        University.changeUniversityName("MIT");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
