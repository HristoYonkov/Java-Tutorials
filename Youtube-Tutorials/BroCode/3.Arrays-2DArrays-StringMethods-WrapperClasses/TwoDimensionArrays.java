public class TwoDimensionArrays {
    public static void main(String[] args) {
        // An array of array = 2D array
        String[][] cars = {
                { "Moskvich", "Lada", "Uaz" },
                { "Mitsubishi", "Honda", "Toyota" },
                { "Mercedess", "Audi", "BMW" }
        };

        // String[][] cars = new String[3][3];
        // cars[0][0] = "Moskvich";
        // cars[0][1] = "Lada";
        // cars[0][2] = "Uaz";
        // cars[1][0] = "Mitsubishi";
        // cars[1][1] = "Honda";
        // cars[1][2] = "Toyota";
        // cars[2][0] = "Mercedess";
        // cars[2][1] = "Audi";
        // cars[2][2] = "BMW";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

    }
}
