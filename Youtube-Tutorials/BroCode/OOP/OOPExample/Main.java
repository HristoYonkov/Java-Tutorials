public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mitsubishi", "lancer", 2010, "White", 10.00);
        Car car2 = new Car("Toyota", "Supra", 2010, "Blue", 30.00);

        System.out.println(car1.brand);
        System.out.println(car2.model);

        car1.drive();
        car2.brake();
    }
}