import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JLabel label;
    JTextField text;
    JButton btnOK;
    JButton btnClear;
    JTextArea area;

    public MyFrame() {
        setSize(450, 400);
        setLocation(700, 400);
        setTitle("双色球生成器");

        setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        label = new JLabel("请输入想生成的组数");
        text = new JTextField(20);
        btnOK = new JButton("确定");
        btnClear = new JButton("清空");
        area = new JTextArea(10, 20);

        new JScrollPane(area);

        p1.add(label);
        p1.add(text);
        p1.add(btnOK);
        p1.add(btnClear);

        p2.add(area);

        add(p1);
        add(p2);

        btnClear.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                area.setText("");
                text.setText("");
            }
        });

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
                String content = text.getText();
                if (content != null && !content.trim().equals("")) {
                    int count = Integer.valueOf(content);
                    for (int i = 0; i < count; i++) {
                        LuckNum luck = new LuckNum();
                        String str = luck.getNum();
                        area.append(str + "\n");
                    }
                }
            }
        });

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}