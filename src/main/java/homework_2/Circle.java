package homework_2;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        circle1.setRadius(12);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateCircumference());
    }
}
