package homework_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(double discount) {
        this.setPrice(this.price - discount);
    }

    void printInfo() {
        System.out.println("Product " + this.name + ", price " + this.price);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Chocolate", 10);
        product1.setPrice(11);
        product1.applyDiscount(3);
        product1.printInfo();
    }
}
