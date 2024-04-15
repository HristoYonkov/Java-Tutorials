
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.brand);
        System.out.println(car1.model);

        car1.drive();
        car1.brake();
    }
}

// class Car {
//     String brand = "Mitsubishi";
//     String model = "Lancer";
//     int year = 2020;
//     String color = "blue";
//     double price = 10.000;

//     void drive() {
//         System.out.println("Driving...");
//     }

//     void brake() {
//         System.out.println("Breaking...");
//     }
// }