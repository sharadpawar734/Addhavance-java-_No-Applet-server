import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_action_b_utton extends JFrame {

    public Swing_action_b_utton(){
        JFrame jFrame = new JFrame();


        JButton jButton = new JButton("Click me");
        jButton.setBounds(60,50,120,20);

        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = jButton.getText();
                jButton.setText(str.toUpperCase());
            }
        });

        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_action_b_utton obj = new Swing_action_b_utton();

    }
}
