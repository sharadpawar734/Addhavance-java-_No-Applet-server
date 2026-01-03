import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing_itemevent2 extends JFrame {
    JFrame jFrame;
    JRadioButton jRadioButtonone,jRadioButtonTwo;
    public Swing_itemevent2() {
        jFrame = new JFrame();
        jRadioButtonone = new JRadioButton("Male");
        jRadioButtonone.setBounds(100,50,100,30);

        jRadioButtonTwo = new JRadioButton("Female");
        jRadioButtonTwo.setBounds(100,100,100,30);

        jFrame.add(jRadioButtonone);
        jFrame.add(jRadioButtonTwo);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonone);
        bg.add(jRadioButtonTwo);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(200,50,100,100);
        jFrame.add(jTextArea);

        jRadioButtonone.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == jRadioButtonone){
                  jTextArea.setText("Your gender is male");
                }
                if (e.getSource() == jRadioButtonTwo){
                    jTextArea.setText("your gender is Female");
                }
            }
        });


        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
     Swing_itemevent2 oj466566 = new Swing_itemevent2();
    }
}
