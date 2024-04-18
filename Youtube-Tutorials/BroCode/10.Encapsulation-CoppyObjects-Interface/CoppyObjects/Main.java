public class Main {
    public static void main(String[] args) {

        Car car = new Car("Honda", "Civic", 2020);
        // Car car2 = new Car("Toyota", "Camry", 2022);

        // car2 = car; // Wrong! This way we coppy only the reference!

        // car2.copy(car); // Right way of coppy the object.
        Car car2 = new Car(car); // Coppy constructor way (also viable).

        System.out.println(car);
        System.out.println(car2);
        System.out.println();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car2.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
