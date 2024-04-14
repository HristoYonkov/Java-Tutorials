import java.util.Random;

public class GenerateRandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        // int x = random.nextInt(6) + 1;
        // double x = random.nextDouble();
        boolean x = random.nextBoolean();

        System.out.println(x);
    }
}
