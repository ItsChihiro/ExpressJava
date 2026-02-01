package homework_2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    int calculateArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 17);
        rectangle1.setWidth(12);
        System.out.println(rectangle1.calculateArea());
    }
}
