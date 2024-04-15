
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.brand);
        System.out.println(car1.model);

        car1.drive();
        car2.brake();
    }
}