import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // for-eac (enhanced for loop) = Traversing technique to iterate through the elements in array/collection.
        // Less steps, more readable, also less flexible compare to a standart for loop.

        // String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i: animals) {
            System.out.println(i);
        }
    }
}
