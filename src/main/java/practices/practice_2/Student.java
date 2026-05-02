package practices.practice_2;

public class Student {
    // fields
    int age;
    String name;

    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
    }

    // getter for age
    int getAge(){
        return this.age;
    }

    // getter for name
    String getName(){
        return this.name;
    }

    // setter for age
    void setAge(int newAge){
        this.age = newAge;
    }

    // setter for name
    void setName(String newName){
        this.name = newName;
    }

    void print(){
        System.out.println("Age, " + this.age + " name " + this.name);
    }
}
