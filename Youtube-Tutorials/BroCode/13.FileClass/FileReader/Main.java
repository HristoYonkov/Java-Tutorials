import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // FileReader = Read the contents of a file as a stream of characters. One by
        // one
        // read() returns an int value which contains the byte value
        // when read() returns -1, there is no more da ta to be read.

        try {
            FileReader reader = new FileReader("nature_java.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
