import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // JPanel = A gui component that function as a container to hold other components.

        ImageIcon icon = new ImageIcon("Flash_A_04.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        // label.setVerticalAlignment(JLabel.BOTTOM); // Set it when using layout manager.
        // label.setHorizontalAlignment(JLabel.RIGHT); // Set it when using layout manager.
        label.setBounds(100, 100, 150, 150);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout()); // Set it before adding "label" to the panel!

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null); // Set label bounds in this case.

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null); // Set it before adding "label" to the panel!

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700, 700);
        frame.setVisible(true);

        greenPanel.add(label);
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
