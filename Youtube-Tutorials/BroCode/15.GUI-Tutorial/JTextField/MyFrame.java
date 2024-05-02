import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    MyFrame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00ff00)); // Sets the color of the Characters
        textField.setBackground(Color.black); // Sets the color of the background.
        textField.setCaretColor(Color.white); // Sets the color of the caret (pinging type line).
        textField.setText("Hello.."); // Set the predefined text.

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    JButton button;
    JTextField textField;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // textField.getText(); // Retrieve the text within the textField.
            System.out.println("Welcome " + textField.getText());
            button.setEnabled(false); // Disables the button
            textField.setEditable(false); // Cannot edit text.
        }
    }
    
}
