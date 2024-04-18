package AccessModifiers.package1;
import AccessModifiers.package2.*;

public class A {
    public static void main(String[] args) {
        // protected String protectedMessage = "This is protected"; // protected modifier
        B b = new B();
        // System.out.println(b.privateMessage); // private modifier

        C c = new C();
        // System.out.println(c.defaultMessage); // default modifier
        System.out.println(c.publicMessage); // public modifier
    }
}