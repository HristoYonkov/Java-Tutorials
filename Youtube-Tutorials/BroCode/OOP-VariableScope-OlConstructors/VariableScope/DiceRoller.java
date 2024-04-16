import java.util.Random;

public class DiceRoller {
    DiceRoller() {
        // Variables here are lockal to this method "Constructor".
        // Random random = new Random();
        // int number = 0;
        roll();
    }

    Random random;
    int number;

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
