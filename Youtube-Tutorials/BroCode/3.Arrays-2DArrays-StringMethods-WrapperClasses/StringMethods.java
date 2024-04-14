public class StringMethods {
    public static void main(String[] args) {
        // String = A reference data type that can be store one or more characters.
        // Reference data types have acces to usefull methods.

        String name = "Hristo";

        // boolean result = name.equals("Hristo");
        // boolean result = name.equalsIgnoreCase("hristo");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("H");
        // String result = name.toUpperCase();
        // String result = name.trim();
        String result = name.replace("H", "M");

        System.out.println(result);
    }
}
