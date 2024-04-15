public class PrintfMethod {
    public static void main(String[] args) {
        // printf() = An optional method to control, format and display text to the console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        boolean myBool = true;
        char myChar = 'H';
        String myStr = "Hristo";
        int myInt = 14;
        double myDb = 314;

        // [conversion-characters]
        System.out.printf("%b This is a format boolean \n", myBool);
        System.out.printf("%c This is a format char \n", myChar);
        System.out.printf("%s This is a format string \n", myStr);
        System.out.printf("%d This is a format integer \n", myInt);
        System.out.printf("%f This is a format double \n", myDb);

        // [width]
        // Minimum number of characters to be written as output.
        System.out.printf("Hello %10s end.\n", myStr); // Prints minimum 10 characters for the "name" variable including the length of the name.
        System.out.printf("Hello %-10s end.\n", myStr); // all of the spaces are coming after the "name" variable.

        // [precision]
        // Sets number of digits of precision when outputting float-point values
        System.out.printf("My money %.2f\n", myDb);

        // [flags]
        // Adds an effect to output based on the flag added to format specifier.
        // - : left-justify
        // + : outputs a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000 = 1,000 

        System.out.printf("My money %+f\n", myDb); // Outputs +314 and if there is a minus -314.
        System.out.printf("My money %020f\n", myDb); // Adds a 0 in from of the number
        System.out.printf("My money %,f\n", myDb); // if the number is 1000 output = 1,000.000000
    }
}
