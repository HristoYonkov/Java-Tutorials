public class Main {
    public static void main(String[] args) {
        // interface = A template that can be applied to a class.
        // similar to inheritance, but specified what a class has/must do.
        // Classes can apply more than one interface, inheritance is limited
        // to one direct super class.

        Rabbit rabbid = new Rabbit();
        rabbid.flee();

        System.out.println();

        Hawk hawk = new Hawk();
        hawk.hunt();

        System.out.println();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
