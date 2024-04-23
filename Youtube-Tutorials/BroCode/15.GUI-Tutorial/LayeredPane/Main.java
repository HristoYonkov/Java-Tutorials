import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {
    public static void main(String[] args) {
        // LayeredPane = Swing container that provides a
        // third dimension for positioning components ex. depth, Z-Index.

        JLabel label1 = new JLabel();
        label1.setOpaque(true); //To be set BG color.
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0, 0, 500, 500);

        // Add panes and adjust the order they are visible.
        pane.add(label1, JLayeredPane.DEFAULT_LAYER);
        pane.add(label2, Integer.valueOf(2));
        pane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
