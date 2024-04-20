import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = An abstract representation of file and directory pathnames.

        File file = new File("test_message.txt"); // If the file is within the project folder will be found.
        // File file = new File("C:/Users/Hristo/Desktop/Java-Tutorials/Youtube-Tutorials/BroCode/13.FileClass/test_message.txt");
        // If the file is not in the project folder, path should be added!.

        if (file.exists()) {
            System.out.println("That file exist :))");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile()); // Returns a boolean wheter the file is file or folder..
            file.delete(); // Delete a file..
            
        } else {
            System.out.println("That fiel does't exist :((");
        }
    }
}
