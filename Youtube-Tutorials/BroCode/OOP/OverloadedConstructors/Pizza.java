
public class Pizza {
    // Overloaded constructors are like overloaded methods.
    Pizza(String bread, String sauce, String cheese, String topping, int price) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
        this.price = price;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza() {

    }

    String bread;
    String sauce;
    String cheese;
    String topping;
    int price;

}
