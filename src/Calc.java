import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
    private JPanel Calc;
    private JButton btnThree;
    private JButton btnSix;
    private JTextField textDisplay;
    private JButton btnSeven;
    private JButton btnDot;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton buDel;
    private JButton btnSub;
    private JButton btnMulti;
    private JButton btnDiv;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton buEquals;
    private JButton btnClear;

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

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroTxt = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroTxt);
            }
        });
    }

    public static void main(String[] args) {
        new Calc();
    }
}
