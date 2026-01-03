import javax.swing.*;
import java.awt.*;

public class Swing_gridBaglayout extends JFrame {

    public Swing_gridBaglayout(){
        JFrame jFrame = new JFrame();

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");


        GridBagLayout gridBagLayout = new GridBagLayout();
        jFrame.setLayout(gridBagLayout);

        Container c =getContentPane();
        c.setLayout(gridBagLayout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.weightx=0.5;
        gbc.gridx=0;
        gbc.gridy=0;
        jFrame.add(b1,gbc);

//        gbc.weightx=0;
        gbc.gridx=1;
        gbc.gridy=0;
        jFrame.add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        jFrame.add(b3,gbc);

        gbc.gridwidth = 3;
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.ipady = 40;
        jFrame.add(b4,gbc);

        gbc.gridwidth  = 2 ;
        gbc.ipady = 0;
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.weighty = 1;
        jFrame.add(b5,gbc);

        pack();

        jFrame.setBounds(100,200,500,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_gridBaglayout ong544 = new Swing_gridBaglayout();
    }
}
