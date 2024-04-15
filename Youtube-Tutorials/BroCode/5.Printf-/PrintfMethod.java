public class PrintfMethod {
    public static void main(String[] args) {
        // printf() = An optional method to control, format and display text to the console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        boolean myBool = true;
        char myChar = 'H';
        String myStr = "Hristo";
        int myInt = 14;
        double myDb = 3.14;

        // [conversion-characters]
        System.out.printf("%b This is a format boolean \n", myBool);
        System.out.printf("%c This is a format char \n", myChar);
        System.out.printf("%s This is a format string \n", myStr);
        System.out.printf("%d This is a format integer \n", myInt);
        System.out.printf("%f This is a format double \n", myDb);

        // [width]
        // Minimum number of characters to be written as output.
        System.out.printf("Hello %10s end.\n", myStr); // Prints minimum 10 characters for the "name" including the length of the name.
        System.out.printf("Hello %-10s end.\n", myStr);
    }
}
