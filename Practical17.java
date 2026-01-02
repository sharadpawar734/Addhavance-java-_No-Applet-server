import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Practical17 extends JFrame {
    private JLabel lblName, lblEmail, lblMobile;
    private JTextField tfName, tfEmail, tfMobile;

    public Practical17() {
        setTitle("Person Information Entry");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));


        lblName = new JLabel("Name:");
        lblEmail = new JLabel("Email:");
        lblMobile = new JLabel("Mobile:");

        tfName = new JTextField();
        tfEmail = new JTextField();
        tfMobile = new JTextField();


        tfName.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_SPACE) {
                    e.consume();
                }
            }

            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
            }
        });

        tfEmail.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetterOrDigit(c) && c != '@' && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }

            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
            }
        });

        tfMobile.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }

            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
            }
        });


        add(lblName);
        add(tfName);
        add(lblEmail);
        add(tfEmail);
        add(lblMobile);
        add(tfMobile);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Practical17();
    }
}
