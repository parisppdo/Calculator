import javax.swing.*;

public class Calc extends JFrame {
    private JPanel Calc;
    private JButton bu3;
    private JButton bu6;
    private JTextField tf;
    private JButton bu7;
    private JButton budot;
    private JButton bu0;
    private JButton buand;
    private JButton budel;
    private JButton busub;
    private JButton bumulti;
    private JButton budiv;
    private JButton bu8;
    private JButton bu9;
    private JButton bu4;
    private JButton bu5;
    private JButton bu1;
    private JButton bu2;
    private JButton buans;
    private JButton buc;

    String operators = null;
    double number1 = 0, number2 = 0;


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
