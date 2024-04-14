public class WrapperClasses {
    public static void main(String[] args) {
        // Wrapper class = Provides a way to use primitive data types as reference data types
        // reference data types contains usefull methods
        // also can be used with collections "ex.ArrayLists".

        // Primitive    Wrapper
        // ---------    -------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // Autoboxing = The automatic conversion that Java compiler makes between the primitive types and their corresponding object wrapper classes.
        // Unboxing = The reverse of autoboxing. Automatic conversion of wrapper class to primitive.

        Boolean a = true;
        Character b = 'H';
        Integer c = 123;
        Double d = 3.14;
        String e = "Ico";

        if (a == true) {
            // This is unboxing.. When you treat reference data types as if they where primitives.
            System.out.println("This is: " + a);
        }
    }
}
