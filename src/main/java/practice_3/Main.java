package practice_3;

import homework_2.StudentGroup;

public class Main {
    public static void main(String[] args){
        // declared a variable
        // assigned a variable the instance of the class Student
        // called default constructor

        System.out.println(Student.studentCount);

        Student petya = new Student(18, "Petya");
        System.out.println(Student.studentCount);

        Student kolya = new Student(20, "Kolya");
        System.out.println(Student.studentCount);

        // System.out.println(Student.maxYears);
        // Student.printMaxYears();
    }
}
