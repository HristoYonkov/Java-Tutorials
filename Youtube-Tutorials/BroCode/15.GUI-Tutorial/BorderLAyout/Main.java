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
        // new BorderLayout() = Changes the way panels should be displayed
        // with setPreferredSize(new Dimension()).
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

        // ------ Sub Panels ----------------------
        JPanel topPanel1 = new JPanel();
        JPanel botPanel2 = new JPanel();
        JPanel leftPanel3 = new JPanel();
        JPanel rightPanel4 = new JPanel();
        JPanel centerPanel5 = new JPanel();

        topPanel1.setBackground(Color.black);
        botPanel2.setBackground(Color.darkGray);
        leftPanel3.setBackground(Color.gray);
        rightPanel4.setBackground(Color.lightGray);
        centerPanel5.setBackground(Color.white);

        // Add new layout manager to the center panel
        // which is acting as a container fo the new inner panels.
        centerPanel.setLayout(new BorderLayout());

        topPanel1.setPreferredSize(new Dimension(50, 50));
        botPanel2.setPreferredSize(new Dimension(50, 50));
        leftPanel3.setPreferredSize(new Dimension(50, 50));
        rightPanel4.setPreferredSize(new Dimension(50, 50));
        centerPanel5.setPreferredSize(new Dimension(50, 50));

        centerPanel.add(topPanel1, BorderLayout.NORTH);
        centerPanel.add(botPanel2, BorderLayout.SOUTH);
        centerPanel.add(leftPanel3, BorderLayout.WEST);
        centerPanel.add(rightPanel4, BorderLayout.EAST);
        centerPanel.add(centerPanel5, BorderLayout.CENTER);
        // ----- Sub Panels ------------------------

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(botPanel, BorderLayout.SOUTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(centerPanel, BorderLayout.CENTER);
    }
}
