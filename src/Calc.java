import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

    private double buffer1 = 0.0, buffer2 = 0.0;
    private char mathOperator;

    private JPanel Calc;
    private JButton btnThree;
    private JButton btnSix;
    private JTextField textDisplay;
    private JButton btnSeven;
    private JButton btnDot;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnDel;
    private JButton btnSub;
    private JButton btnMulti;
    private JButton btnDiv;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnEquals;
    private JButton btnClear;

    private void getOperator (String btnText) {
        mathOperator = btnText.charAt(0);
        buffer1 = buffer1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

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

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneTxt = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneTxt);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoTxt = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoTxt);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeTxt = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnThreeTxt);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourTxt = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourTxt);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveTxt = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveTxt);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixTxt = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixTxt);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenTxt = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenTxt);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightTxt = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightTxt);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineTxt = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineTxt);
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                }
                else if (textDisplay.getText().contains(".")) {
                    btnDot.setEnabled(false);
                }
                else {
                    String btnDotText = textDisplay.getText() + btnDot.getText();
                    textDisplay.setText(btnDotText);
                }
                btnDot.setEnabled(true);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnPlus.getText());
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnSub.getText());
            }
        });

        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnMulti.getText());
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnDiv.getText());
            }
        });

        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator) {
                    case '+':
                        buffer2 = buffer1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        buffer2 = buffer1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        buffer2 = buffer1 * Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        buffer2 = buffer1 / Double.parseDouble(textDisplay.getText());
                        break;
                }

                String result = Double.toString(buffer2);
                textDisplay.setText(result);
                buffer1 = 0;
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer2 = 0;
                textDisplay.setText("");
            }
        });

        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Calc();
    }
}
