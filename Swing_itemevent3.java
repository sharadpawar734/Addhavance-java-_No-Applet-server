import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing_itemevent3 extends JFrame {
  JCheckBox c1, c2, c3, c4;

    public Swing_itemevent3(){
        JFrame jFrame = new JFrame();

        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("Gradution");
        c4 = new JCheckBox("Post-Graduation");

        c1.setBounds(50,50,100,30);
        c2.setBounds(50,100,100,30);
        c3.setBounds(50,150,100,30);
        c4.setBounds(50,200,100,30);

        jFrame.add(c1);
        jFrame.add(c2);
        jFrame.add(c3);
        jFrame.add(c4);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(200,50,100,100);
        jFrame.add(jTextArea);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
              if (c1.isSelected()){
                  jTextArea.setText("10th");
              }
                if (c2.isSelected()){
                    jTextArea.setText("12th");
                }
                if (c3.isSelected()){
                    jTextArea.setText("Graduation");
                }
                if (c4.isSelected()){
                    jTextArea.setText("Graduation");
                }
            }
        });


        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_itemevent3 obj73269 = new Swing_itemevent3();
    }
}
