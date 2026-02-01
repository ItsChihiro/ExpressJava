package practice_1;

public class Test {
    int x; // a non-static field x of type int is declared in the class, which is 0 by default
    Test(int x) {this.x = x;} // a constructor is defined that takes the parameter x and uses the "this" keyword
    // to assign this value to the field x of current object
    public static void main(String[] args) { // the main method is declared, which is the entry point of the program
        Test test = new Test(5); // a new object of class  is created, 5 is passed to the constructor,
        // and the object's x field is initialized with this value
    System.out.println(test.x); // the value of the x field of the object test is printed to the console, which is 5
    }
    { int x2 = 2; System.out.println(x2); }
}
