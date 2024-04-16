
public class Main {
    public static void main(String[] args) {
        // toString() = Special method that all objects inherit, that returns a string that
        // "textually represents" an object. Can be used both implicitly and explicitly.

        // Normally toString() shows address of the "car" object that you can find in your computer memmory.
        // Todo: Check about method overriding!
        CarNew car = new CarNew();

        System.out.println(car.brand);
        System.out.println(car);
        System.out.println(car.toString()); // toString() was overrided!
    }
}
