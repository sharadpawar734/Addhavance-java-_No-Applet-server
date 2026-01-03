import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing_itemevent4 extends JFrame {
 JMenuBar menuBar;
 JMenu mymenu;
 JCheckBoxMenuItem c1, c2, c3;
    public Swing_itemevent4() {
        JFrame jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(200,50,100,100);
        jFrame.add(jTextArea);

        menuBar = new JMenuBar();
        mymenu = new JMenu("File");

        c1 = new JCheckBoxMenuItem("Print");
        mymenu.add(c1);
        menuBar.add(mymenu);

        c2 = new JCheckBoxMenuItem("Save");
        mymenu.add(c2);
        menuBar.add(mymenu);

        c3 = new JCheckBoxMenuItem("Delete");
        mymenu.add(c3);
        menuBar.add(mymenu);

        jFrame.setJMenuBar(menuBar);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c1.isSelected()){
                    jTextArea.setText("Print is on");
                } else {
                    jTextArea.setText("print is off");
                }
            }
        });

        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c2.isSelected()){
                    jTextArea.setText("Save is on");
                } else {
                    jTextArea.setText("Saveis off");
                }
            }
        });

        c3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c3.isSelected()){
                    jTextArea.setText("Delete is on");
                } else {
                    jTextArea.setText("Delete is off");
                }
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_itemevent4 obfy53 = new Swing_itemevent4();
    }
}
