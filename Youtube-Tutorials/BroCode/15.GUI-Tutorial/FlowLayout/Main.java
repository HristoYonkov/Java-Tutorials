import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        // Layour Manager = Defines the natural layout for components within a container.
        // FlowLayout = Places component in a row, sized at theit preferred size.
        // If the horizontal space in the container is too small,
        // the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING)); // Buttons stick to the left.
        // frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); // Buttons are stick to the right side.
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10)); // Center is default behavior, also set gap between the buttons.
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 250)); // Set size to the panel.
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout()); // Add layout to the panel too.

        panel.add(new JButton("B1"));
        panel.add(new JButton("B2"));
        panel.add(new JButton("B3"));
        panel.add(new JButton("B4"));
        panel.add(new JButton("B5"));
        panel.add(new JButton("B6"));
        panel.add(new JButton("B7"));
        panel.add(new JButton("B8"));
        panel.add(new JButton("B9"));

        // To fix the bug with some components we need to add visibility to the end.
        frame.setVisible(true);
        frame.add(panel);
    }
}
