package practice_5.task_2;

public class Electronics extends Item{
    private final static int DEFAULT_WARRANTY = 2;
    private int warranty;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.warranty = DEFAULT_WARRANTY;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", warranty " + this.warranty + " years");
    }
}
