public class Main {
    public static void main(String[] args) {
        // polymorphism = Greek word for poly-"many", morph-"form".
        // The ability of an object to identify as more than one type.
        // (Onde declaration many implementations..)

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        // Car[] racers = { car, bicycle, boat }; // Problem with the type

        // All of the objects also identifies as a "Vehicle".
        Vehicle[] racers = { car, bicycle, boat }; // using the power of polymorphism

        for(Vehicle x : racers) {
            x.go();
        }
    }
}
