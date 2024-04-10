import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("How old are you?: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //Fix for "/n" that nextInt() does not read new line characters!
        System.out.println("What is your favorite food?: ");
        String food = scanner.nextLine();

        System.out.println(name + " you are " + age + " years old!");
        System.out.println("You like " + food);

    }
}