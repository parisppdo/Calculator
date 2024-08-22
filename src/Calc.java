import javax.swing.*;

public class Calc extends JFrame {
    private JPanel Calc;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;

    public Calc() {
        setContentPane(Calc);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setSize(545, 365);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calc();
    }
}
