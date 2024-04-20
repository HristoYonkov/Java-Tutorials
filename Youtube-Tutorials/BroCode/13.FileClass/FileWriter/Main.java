import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Java-Basics.txt");
            writer.write("Use this repo as a crash course. \nAlso to remmember if you are not remmember something!");
            writer.append("\nBasics are written by: Hristo."); // Appends string or characters to the end of your file.
            writer.close(); // Be sure to close the writer after you have done with em.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
