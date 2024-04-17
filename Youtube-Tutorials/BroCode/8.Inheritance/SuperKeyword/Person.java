public class Person {
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}
