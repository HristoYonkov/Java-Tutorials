public class Main {
    public static void main(String[] args) {
        // Method overriding = Declaring a method in sub class,
        // which is already present in parent class, so that a child class
        // can give it's own implementation.

        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.speak();
        dog.speak();
    }
}
