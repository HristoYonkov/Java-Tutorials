import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        
        this.setTitle("JFrame title goes here.."); // Sets title of frame.
        this.setSize(450, 450); // Sets "x" and "y" dimensions of frame.
        // this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Default condition on X button.
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Do nothing on X button.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of app with X button.
        this.setResizable(false); // Prevents frame from resizing.

        this.setVisible(true); // make rame visible.

        ImageIcon image = new ImageIcon("C:/Users/Hristo/Desktop/Java-Tutorials/Youtube-Tutorials/BroCode/GUI/GUI-Tutorial/lib/wolf.png"); // Creates an ImageIcon.
        this.setIconImage(image.getImage()); // Change icon frame.
        // this.getContentPane().setBackground(Color.green); // Change color of background.
        // this.getContentPane().setBackground(new Color(0x000000)); // Hexademical colours.
        this.getContentPane().setBackground(new Color(0, 255, 0));
    }
}
