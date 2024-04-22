import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
    MyFrame() {

        ImageIcon icon = new ImageIcon("Flash_A_04.png");
        ImageIcon icon2 = new ImageIcon("Explosion_A.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 300, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 155);
        // button.addActionListener(e -> System.out.println("Boom..")); // lambda expression way.
        button.addActionListener(this);
        button.setText("I'm a button.");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Cosmic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15); // Pull the text closer to icon.
        button.setForeground(Color.cyan); // Sets font color
        button.setBackground(Color.lightGray); // Sets bg-color of the button.
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    JButton button;
    JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Boom..");
            button.setEnabled(false); // Disables the button.
            label.setVisible(true);
        }
    }

    
}
