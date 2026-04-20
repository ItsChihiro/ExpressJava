package practices.practice_1;

public class HelloWorld {
    // fields
    static int a = 1;



    // method main is the entry point to the program
    public static void main(String[] args) {
        int sum1 = sum(1, 2);
        System.out.println("Result of a sum " + sum1);

        int mult1 = multiply(3, 5);
        System.out.println("Result of a product " + mult1);

        int sub1 = substruct(34, 12);
        System.out.println("Result of a substruct " + sub1);

        double div1 = divide(3, 2);
        System.out.println("Result of a dividing " + div1);
    }

    public static int sum(int x, int y) {
        // body of a method
        return x + y; // returned value of a method
    }

    public static int multiply(int p, int k) { // parameters of a method
        // body of a method
        int mult = p * k; // created a variable, declared a value equal to result of a product p and k
        return mult;
    }

    public static int substruct(int g, int l) {
        return g - l;
    }

    public static double divide(int s, int h) {
        return (double) s / h;
    }
}
