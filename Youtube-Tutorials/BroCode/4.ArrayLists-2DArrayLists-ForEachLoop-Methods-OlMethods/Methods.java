public class Methods {
    public static void main(String[] args) {
        // Method = A block of code that is executed whenever it is called upon.

        String name = "Hristo";
        int age = 33;
        hello(name, age);

        int x = 5;
        int y = 10;
        // In this case two variables "z", is local variable and add method does not recognize it.
        int z = add(x, y);
        System.out.println(z);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
