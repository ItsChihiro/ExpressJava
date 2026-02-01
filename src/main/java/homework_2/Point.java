package homework_2;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void setX(int newX){
        this.x = newX;
    }

    void print() {
        System.out.println("{" + this.x + ";" + this.y + "}");
    }

    public static void main(String[] args) {
        Point point1 = new Point(12, 65);
        point1.setX(15);
        point1.print();
    }
}
