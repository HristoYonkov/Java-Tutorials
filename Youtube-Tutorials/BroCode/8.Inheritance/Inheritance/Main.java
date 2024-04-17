public class Main {
    public static void main(String[] args) {
        // Inheritance = The process where one class acquires
        // the attributes and methods of another.

        Car car = new Car("Mitsubishi");
        Bicycle bike = new Bicycle("Corratec");
        
        car.go();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
        System.out.println(bike.name);
    }
}
