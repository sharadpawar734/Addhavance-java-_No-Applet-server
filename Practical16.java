import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Practical16 extends JFrame {

    public Practical16() {

        JFrame jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(10,10,350,350);
        jFrame.add(jTextArea);

        jTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                jTextArea.setText(jTextArea.getText() + "\n" + "key is Type:  " + e.getKeyChar());
                jTextArea.setBackground(Color.red);

            }

            @Override
            public void keyPressed(KeyEvent e) {
                jTextArea.setText(jTextArea.getText() + "\n" +"Key is pressed:  " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jTextArea.setText(jTextArea.getText() + "\n" +"key is relised:  " +e.getKeyChar());
            }
        });



        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Practical16 obh533 = new Practical16();
    }
}
