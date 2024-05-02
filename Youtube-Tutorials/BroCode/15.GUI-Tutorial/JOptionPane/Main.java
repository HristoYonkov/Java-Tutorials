import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = Pop-up a standart dialog box that prompts users for a value
        // or informs them of something. There is a few variations of dialog boxes.

        // JOptionPane.showMessageDialog(null, "Some plain message.", "plain Title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Some information message.", "information Title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Some question message.", "question Title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Some warning message.", "warning Title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Some error message.", "error Title", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "Are you ok?", "question Title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(answer); // Returns -1 for click "x", 0 for "yes", 1 for "no", 2 for "cancel";
    }
}
