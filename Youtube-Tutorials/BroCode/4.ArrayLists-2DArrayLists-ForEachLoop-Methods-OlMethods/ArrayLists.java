import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList = A resizable array. Elements can be added and removed after
        // compilation phase which you can not do with standart arrays.
        // They only store reference data types.

        ArrayList<String> food = new ArrayList<String>();

        food.add("Tarator");
        food.add("Sallad");
        food.add("Stek");

        // Usefull Methods..
        food.set(0, "Shkembe Chorba"); // Replaces the values in the array.
        food.remove(0); // Removes the values in the array.
        // food.clear(); // Clear the entire array.

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}
