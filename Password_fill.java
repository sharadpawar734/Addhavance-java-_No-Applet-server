import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password_fill extends JFrame {

    public JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;
    public Password_fill(){
        jFrame = new JFrame();
        jFrame.setTitle("this is iframe tutorial");

        jLabel= new JLabel("Password");
        jLabel.setBounds(40,10,100,20);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,10,100,20);

        JButton jButton = new JButton("Check");
        jButton.setBounds(20,70,100,20);

        jFrame.add(jLabel);
        jFrame.add(jPasswordField);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           jLabel.setText(jPasswordField.getText());//ya action listner he Hide kelela password Shows
                                                    // kartil
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
      Password_fill object = new Password_fill();
    }
}
