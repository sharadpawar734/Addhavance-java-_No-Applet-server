import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_project extends JFrame {

    public Demo_project(String s) {
        super(s);
        JFrame jFrame = new JFrame("My chating Windows");


        JLabel j1 = new JLabel(" ");
        j1.setBounds(220,270,250,30);

        JLabel j2 = new JLabel(" Do you know me ");
        j2.setBounds(20,220,250,30);

        JLabel j3 = new JLabel(" Prem from Jalgoan ");
        j3.setBounds(220,170,250,30);

        JLabel j4 = new JLabel(" I am Sharad & you ");
        j4.setBounds(20,110,250,30);

        JLabel j5 = new JLabel("Hi ");
        j5.setBounds(220,60,250,30);

        JLabel j6 = new JLabel("Hi ");
        j6.setBounds(20,20,250,30);


        JTextField TF1 = new JTextField("Enter your text //",12);
        TF1.setBounds(5,330,300,30);

        JButton jButton = new JButton("Send msg");
        jButton.setBounds(280,330,110,30);

        String doc[] = {"Document","Location","Gallary","Audio"};
        JComboBox jComboBox = new JComboBox<>(doc);
        jComboBox.setBounds(280,300,90,20);

        String emoji[] = {"😊","😂"};
        JComboBox jComboBox2 = new JComboBox<>(emoji);
        jComboBox2.setBounds(230,300,40,20);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = TF1.getText();
                j1.setText(String.valueOf(inputText ));
            }
        });

        jFrame.add(TF1);
        jFrame.add(jButton);
        jFrame.add(j1);
        jFrame.add(j2);
        jFrame.add(j3);
        jFrame.add(j4);
        jFrame.add(j5);
        jFrame.add(j6);
        jFrame.add(jComboBox);
        jFrame.add(jComboBox2);

        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Demo_project obj54 = new Demo_project("");
    }
}
