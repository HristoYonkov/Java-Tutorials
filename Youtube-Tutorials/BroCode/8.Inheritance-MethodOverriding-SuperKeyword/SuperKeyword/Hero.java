public class Hero extends Person {
    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    String power;

    public String toString() {
        return super.toString() + this.power;
    }
}
