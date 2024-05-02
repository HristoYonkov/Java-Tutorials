import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("xIcon.png");
        checkIcon = new ImageIcon("checkIcon.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkbox = new JCheckBox();
        checkbox.setText("I'm not a robot!");
        checkbox.setFocusable(false); // Remove the annoying border.
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkbox.setIcon(xIcon); // Sets icon when unchecked.
        checkbox.setSelectedIcon(checkIcon); // Sets icon when checked.

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    JButton button;
    JCheckBox checkbox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkbox.isSelected()); // Tells if the checkbox is selected (boolean) value.
        }
    }
    
}
