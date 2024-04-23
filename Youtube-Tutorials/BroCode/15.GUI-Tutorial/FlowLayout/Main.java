import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Layour Manager = Defines the natural layout for components within a container.
        // FlowLayout = Places component in a row, sized at theit preferred size.
        // If the horizontal space in the container is too small,
        // the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
