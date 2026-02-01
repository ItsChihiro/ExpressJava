package practice_2;


import practice_3.Test1;

public class Main {
    static void main(String[] args) {
        // check default constructor
        Student petya = new Student(18, "Petya");

        petya.print();

        Student kolya = new Student(20, "Kolya");

        kolya.print();

        petya.setName("Anton");
        petya.print();

        petya.name = "Maks";
        petya.print();

        kolya.setAge(21);
        kolya.print();

        kolya.age = 22;
        kolya.print();
    }

    // debug, breakpoint
}
