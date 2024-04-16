
public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car = new Car("Honda");
        Car car2 = new Car("Toyota");

        garage.park(car);
        garage.park(car2);
    }
    
}