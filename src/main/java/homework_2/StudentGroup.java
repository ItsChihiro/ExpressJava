package homework_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("Group: " + this.groupName + ", student count " + this.studentCount);
    }

    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup("A", 18);
        studentGroup1.setStudentCount(19);
        studentGroup1.printInfo();
    }
}
