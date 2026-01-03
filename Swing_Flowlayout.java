import javax.swing.*;
import java.awt.*;

public class Swing_Flowlayout extends JFrame {

    public Swing_Flowlayout(){
        JFrame jFrame = new JFrame();


        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");

        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        jFrame.add(b4,0);
        jFrame.add(b5,0);

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);
        flowLayout.setHgap(10);
        flowLayout.setVgap(20);


        jFrame.setBounds(100,200,500,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       Swing_Flowlayout ofu = new Swing_Flowlayout();
    }
}
