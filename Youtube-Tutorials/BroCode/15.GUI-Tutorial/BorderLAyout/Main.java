import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components whitin a container.

        // 3 commone managers.

        // BorderLayout = A BorderLayout places components in five areas:
        // NORTH, SUTH, EAST, WEST, CENTER. All extra space is placed in the center area.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10)); // Sets margin of the panels.
        frame.setVisible(true);

        JPanel topPanel = new JPanel();
        JPanel botPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        topPanel.setBackground(Color.red);
        botPanel.setBackground(Color.green);
        leftPanel.setBackground(Color.yellow);
        rightPanel.setBackground(Color.magenta);
        centerPanel.setBackground(Color.blue);

        // In following cases you can change only thickness of the panels.
        topPanel.setPreferredSize(new Dimension(100, 100));
        botPanel.setPreferredSize(new Dimension(100, 100));
        leftPanel.setPreferredSize(new Dimension(100, 100));
        rightPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));

        // ------ Sub Panels ------------------
        JPanel topPanel1 = new JPanel();
        JPanel botPanel2 = new JPanel();
        JPanel leftPanel3 = new JPanel();
        JPanel rightPanel4 = new JPanel();
        JPanel centerPanel5 = new JPanel();

        topPanel1.setBackground(Color.red);
        botPanel2.setBackground(Color.green);
        leftPanel3.setBackground(Color.yellow);
        rightPanel4.setBackground(Color.magenta);
        centerPanel5.setBackground(Color.blue);

        // In following cases you can change only thickness of the panels.
        topPanel.setPreferredSize(new Dimension(100, 100));
        botPanel.setPreferredSize(new Dimension(100, 100));
        leftPanel.setPreferredSize(new Dimension(100, 100));
        rightPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));
        // ----- Sub Panels ----------------

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(botPanel, BorderLayout.SOUTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(centerPanel, BorderLayout.CENTER);


    }
}
