package practice_1;

public class MathOperations {
    // 1
    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    // 2
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // 3
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    // 4
    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    // 5
    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds/60;
    }

    // 6
    public static double averageSpeed(double distance, double time){
        return distance/time;
    }

    // 7
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // 8
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // 9
    public static double calculatePercentage(double total, double part) {
        return part/total * 100;
    }

    // 10
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        System.out.println("1 Task");
        int add1 = add(100, 45);
        System.out.println(add1);

        int substract1 = substract(100, 45);
        System.out.println(substract1);

        int multiply1 = multiply(10, 4);
        System.out.println(multiply1);

        double divide1 = divide(100, 45);
        System.out.println(divide1);


        System.out.println("2 Task");
        int maxNum = findMax(34, 35);
        System.out.println(maxNum);


        System.out.println("3 Task");
        int difference1 = difference(89, 50);
        System.out.println(difference1);


        System.out.println("4 Task");
        int squareArea1 = squareArea(4);
        System.out.println(squareArea1);

        int squarePerimeter1 = squarePerimeter(6);
        System.out.println(squarePerimeter1);


        System.out.println("5 Task");
        double convertSecondsToMinutes1 = convertSecondsToMinutes(120);
        double convertSecondsToMinutes2 = convertSecondsToMinutes(88);
        System.out.println(convertSecondsToMinutes1);
        System.out.println(convertSecondsToMinutes2);


        System.out.println("6 Task");
        double averageSpeed1 = averageSpeed(340.56, 2);
        double averageSpeed2 = averageSpeed(999, 5.6);
        System.out.println(averageSpeed1);
        System.out.println(averageSpeed2);


        System.out.println("7 Task");
        double hypotenuse1 = findHypotenuse(3, 7);
        double hypotenuse2 = findHypotenuse(12, 9);
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);


        System.out.println("8 Task");
        double circleCircumference1 = circleCircumference(5.5);
        double circleCircumference2 = circleCircumference(32.9);
        System.out.println(circleCircumference1);
        System.out.println(circleCircumference2);


        System.out.println("9 Task");
        double percentage1 = calculatePercentage(200, 25);
        double percentage2 = calculatePercentage(100, 36);
        System.out.println(percentage1);
        System.out.println(percentage2);


        System.out.println("10 Task");
        double celsiusToFahrenheit1 = celsiusToFahrenheit(33);
        double fahrenheitToCelsius1 = fahrenheitToCelsius(89);
        System.out.println(celsiusToFahrenheit1);
        System.out.println(fahrenheitToCelsius1);
    }
}
