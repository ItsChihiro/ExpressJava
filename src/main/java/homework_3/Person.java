package homework_3;

public class Person {
    private String firstName, lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("First name: " + this.firstName + ", Last Name: " + this.lastName + ", SSN: " + this.ssn);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alina", "Smith", "123-123");
        Person person2 = new Person("Max", "Black", "456-456");
        person1.setFirstName("Marina");
        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
