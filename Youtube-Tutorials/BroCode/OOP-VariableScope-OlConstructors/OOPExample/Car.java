public class Car {
    Car(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    
    String brand;
    String model;
    int year;
    String color;
    double price;

    void drive() {
        System.out.println(this.brand + " " + this.model + ": Driving...");
    }

    void brake() {
        System.out.println(this.brand + " " + this.model + ": Breaking...");
    }
}
