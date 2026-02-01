package homework_2;

public class Car {
    String brand;
    int year;

    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    void print(){
        System.out.println("Brand " + this.brand + ", year " + this.year);
    }

    public static void main(String[] args){
        Car bmw = new Car("BMW", 2020);
        bmw.print();

        bmw.setYear(2021);
        bmw.print();
    }
}
