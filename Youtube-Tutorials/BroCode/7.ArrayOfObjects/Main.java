public class Main {
    public static void main(String[] args) {
        
        // Food[] refrigerator = new Food[3];

        Food pizza = new Food("Pizza");
        Food burger = new Food("Burger");
        Food duner = new Food("Duner");

        Food[] refrigerator = { pizza, burger, duner };

        // refrigerator[0] = pizza;
        // refrigerator[1] = burger;
        // refrigerator[2] = duner;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
