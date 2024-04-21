import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        // JLabel = A GUI display are for a string of text, an image, or both.

        JLabel label = new JLabel(); // Creates label.
        // JLabel label = new JLabel("Ima li nqkoi tuk?"); // Creates label.
        label.setText("Ima li nqkoi tuk?"); // Other way to set text.
        
        ImageIcon image = new ImageIcon("Hull_01.png");
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        // Normally the label without our layout manager for our frame using the border layout.
        // It likes to take strings or images centers it and put it to the left side.
        frame.add(label);
    }
}
