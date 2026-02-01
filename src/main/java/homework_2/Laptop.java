package homework_2;

public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Laptop " + this.brand + ", price " + this.price);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 1245.76);
        laptop1.setPrice(1136.99);
        laptop1.printInfo();
    }
}
