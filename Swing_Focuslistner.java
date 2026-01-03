import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Swing_Focuslistner extends JFrame {

    public Swing_Focuslistner() {

        JFrame jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(30,150,200,200);
        jFrame.add(jTextArea);


        JTextField jTextField = new JTextField();
        jTextField.setBounds(30,60,190,20);
        jFrame.add(jTextField);

        jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                jTextArea.setText(jTextArea.getText()+"\n"+"TextBox Focus gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                jTextArea.setText(jTextArea.getText()+"\n"+"textbox Focus lost");
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    Swing_Focuslistner ong = new Swing_Focuslistner();
    }
}
