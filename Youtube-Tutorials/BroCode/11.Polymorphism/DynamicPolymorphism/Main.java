import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choise = scanner.nextInt();

        if (choise == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choise == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid!");
            animal.speak();
        }
    }
}
