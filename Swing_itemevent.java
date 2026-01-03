import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing_itemevent extends JFrame  {
 JComboBox jComboBox;
    public Swing_itemevent() {
       JFrame jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(200,50,100,100);
        jFrame.add(jTextArea);

        String[] values = {"A", "B", "C", "D", "R"};
        jComboBox = new JComboBox<>(values);
        jComboBox.setBounds(50,50,100,30);
        jFrame.add(jComboBox);

        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
              jTextArea.setText(jComboBox.getSelectedItem().toString());

            }
        });


        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setSize(400,400);
    }

    public static void main(String[] args) {
        Swing_itemevent obj1 = new Swing_itemevent();


    }
}
