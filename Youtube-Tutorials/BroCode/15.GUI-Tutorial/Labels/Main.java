import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        // JLabel = A GUI display area for a string of text, an image, or both.

        ImageIcon image = new ImageIcon("Hull_01.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // Creates label.
        // JLabel label = new JLabel("Ima li nqkoi tuk?"); // Creates label.
        label.setText("Ima li nqkoi tuk?"); // Other way to set text.
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT, CENTER, RIGHT of image icon.
        label.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER, BOTTOM of image icon.
        label.setForeground(new Color(0x00FF00)); // Set color of text.
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set font of text.
        label.setIconTextGap(-18); // Set gap of text to image.
        label.setBackground(Color.BLACK); // Set background color.
        label.setOpaque(true); // Display background color.
        label.setBorder(border); // Displays border.
        label.setVerticalAlignment(JLabel.CENTER); // Sets vertical positionposition of "icon + text" within label.
        label.setHorizontalAlignment(JLabel.CENTER); // Sets horizontal positionposition of "icon + text" within label.
        label.setBounds(100, 100, 300, 300); // Sets label "x, y" positions and "dimensions" within frame.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        // Normally the label without our layout manager for our frame using the border layout.
        // It likes to take strings or images centers it and put it to the left side.
        frame.add(label);
        // frame.pack(); // The pack() method is defined in Window class in Java
        // and it sizes the frame so that all its contents are at or above their preferred sizes.
    }
}
