public class Main {
    public static void main(String[] args) {
        // super = Keyword refers to the superclass (parent) of an object
        // very similar to the "this" keyword.

        Hero batman = new Hero("Batman", 42, "$$$");
        Hero superman = new Hero("Superman", 34, "Flying");

        System.out.println(batman.name);
        System.out.println(batman.age);
        System.out.println(batman.power);

        System.out.println(superman.toString());
    }
}
