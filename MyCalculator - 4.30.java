package Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyCalculator() {
        setTitle("计算器-T01");
        setSize(300, 300);
        setLocation(400, 300);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(4, 4, 5, 5));

        JTextField text = new JTextField(15);
        JButton btnClear = new JButton("清除");

        JButton btn9 = new JButton("9");
        JButton btn8 = new JButton("8");
        JButton btn7 = new JButton("7");
        JButton btnplus = new JButton("+");
        JButton btn6 = new JButton("6");
        JButton btn5 = new JButton("5");
        JButton btn4 = new JButton("4");
        JButton btnminus = new JButton("-");
        JButton btn3 = new JButton("3");
        JButton btn2 = new JButton("2");
        JButton btn1 = new JButton("1");
        JButton btnmultiple = new JButton("×");
        JButton btndot = new JButton(".");
        JButton btn0 = new JButton("0");
        JButton btnequal = new JButton("＝");
        JButton btndivide = new JButton("÷");

        p1.add(text);
        p1.add(btnClear);
        p2.add(btn9);
        p2.add(btn8);
        p2.add(btn7);
        p2.add(btnplus);
        p2.add(btn6);
        p2.add(btn5);
        p2.add(btn4);
        p2.add(btnminus);
        p2.add(btn3);
        p2.add(btn2);
        p2.add(btn1);
        p2.add(btnmultiple);
        p2.add(btndot);
        p2.add(btn0);
        p2.add(btnequal);
        p2.add(btndivide);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
}