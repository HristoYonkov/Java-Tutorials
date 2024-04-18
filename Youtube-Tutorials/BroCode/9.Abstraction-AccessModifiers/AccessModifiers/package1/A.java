package package1;
import package2.*;

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
// "default" modifier = Anything using the default access modifier is only visible
// to anything within the same package (available only for "package2").

// "public" modifier = Anything that is public is available or visible to other packages.

// "protected" modifier = Something taht is protected is accessible to a different
// class in a different package, as long as that class is subclass of whatever class
// contains that protected member.

// "private" modifier = Something that is private is only visiible to the class that
// it contains and in nothing else even if it's within the same package!

