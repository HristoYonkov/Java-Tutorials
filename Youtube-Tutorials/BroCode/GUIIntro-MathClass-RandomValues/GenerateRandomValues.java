import java.util.Random;

public class GenerateRandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();

        System.out.println(x);
    }
}
