package practice_3;

public class Student {
    final static int MAX_YEARS;
    static int studentCount;

    static {
        MAX_YEARS = 11;
        studentCount = 0;
    }

    int age;
    String name;

    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
        studentCount++; // increment, increase the value by 1
    }

    static void printMaxYears(){
        int a = 0;
        System.out.println(MAX_YEARS);
    }


}
