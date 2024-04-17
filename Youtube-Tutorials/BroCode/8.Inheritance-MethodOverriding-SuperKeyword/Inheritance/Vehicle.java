public class Vehicle {
    // The Vehicle class is superclass also known as parent class.

    String name;
    double speed;

    void go() {
        System.out.println("This" +this.name+ "is moving..");
    }

    void stop() {
        System.out.println("This" +this.name+ "stops.");
    }
}
