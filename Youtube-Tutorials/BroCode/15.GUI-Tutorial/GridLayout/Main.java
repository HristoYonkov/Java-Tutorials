import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Layour Manager = Defines the natural layout for components within a container.
        
        // Grid Layout = Places components in a grid of cells.
        // Each component takes all the available space within its cell,
        // and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(new GridLayout(3, 3, 5, 5));
        
        frame.add(new JButton("B1"));
        frame.add(new JButton("B2"));
        frame.add(new JButton("B3"));
        frame.add(new JButton("B4"));
        frame.add(new JButton("B5"));
        frame.add(new JButton("B6"));
        frame.add(new JButton("B7"));
        frame.add(new JButton("B8"));
        frame.add(new JButton("B9"));
        
        
        frame.setVisible(true);
    }
}
