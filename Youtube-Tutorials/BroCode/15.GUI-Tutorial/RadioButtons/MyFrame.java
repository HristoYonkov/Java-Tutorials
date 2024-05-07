import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("pizza.png");
        hamburgerIcon = new ImageIcon("hamburger.png");
        hotdogIcon = new ImageIcon("hotdog.png");

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");
        
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);
        
        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);
        
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);
        
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza.");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered hamburger.");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered hotdog.");
        }
    }
    
}
