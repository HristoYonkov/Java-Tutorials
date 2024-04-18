public class Main {
    public static void main(String[] args) {
        // Encapsulation = Attributes of a class will be hidden or private
        // can be accessed only through methods (getters & setters)
        // You should make attributes private if you don't have a reason to make
        //  them public or protected.

        Car car = new Car("Honda", "Civic", 2020);

        car.getBrand();
        // System.out.println(car.getModel);
        // System.out.println(car.getYear);

        // car.setYear(2022);
    }
}
