import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_actionPerformed extends JFrame {

    public Swing_actionPerformed() {
        JFrame jFrame = new JFrame();

        JTextField jTextField = new JTextField();
        jTextField.setBounds(50,70,120,30);
        jFrame.add(jTextField);

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = jTextField.getText();
                jTextField.setText(str.toLowerCase());
            }
        });

        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_actionPerformed obj = new Swing_actionPerformed();
    }
}
