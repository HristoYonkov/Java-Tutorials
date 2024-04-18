public class Car extends Vehicle {
    // If parent class does not have such a method error will be thrown if "@Override" is set.
    // Try to comment the "Vehicle" class "go()" method.
    
    @Override // Explicitly overrides method "go()" if parent class have it.
    void go() {
        System.out.println("Car is moving..");
    }
}
