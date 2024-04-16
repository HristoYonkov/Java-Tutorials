
public class Main {
    public static void main(String[] args) {
        // Pizza pizza = new Pizza("Italian","tomato","mozzerella","chili",15);
        Pizza pizza = new Pizza("Italian","tomato","mozzerella");
        // Pizza pizza = new Pizza();

        System.out.println("Here are the ingredients for your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println(pizza.price);
    }
}
