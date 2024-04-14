public class Arrays {

    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable.
        // String[] cars = {"Camaro", "Mitsubishi", "Toyota"};
        // cars[0] = "Moskvich";

        // System.out.println(cars[3]);

        // New way of assigning arrays
        String[] carss = new String[3];

        carss[0] = "Moskvich";
        carss[1] = "Mitsubishi";
        carss[2] = "Toyota";

        System.out.println(carss[2]);
    }
}